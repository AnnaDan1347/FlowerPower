package by.training.oop.flower.store.application;

import by.training.oop.flower.store.model.Accessory;
import by.training.oop.flower.store.model.Bouquet;
import by.training.oop.flower.store.model.Flower;
import by.training.oop.flower.store.model.Good;
import by.training.oop.flower.store.prices.ReadFromJSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Office {

    private Store store;

    private boolean runFlag = true;

    private ReadFromJSON reader;

    List<Good> currentBouquet;

    List<Flower> flowerInInterval;

    public Office() {
        store = new Store();
        reader = new ReadFromJSON();
    }

    public void run() {
        System.out.println("The Store is online. Enter \"new\" to start making a bouquet");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;

        while (runFlag) {

            try {
                s = br.readLine();
                switch (s) {
                case "new":
                    reader.readFlowerToStore(store);
                    System.out.println("Hello! Today our product range offers:");
                    store.getFlowers().forEach(good -> {
                        Flower flower = (Flower) good;
                        System.out.println(flower.getId() + " " + flower.getColor() + "  " + flower.getFlowerKind()
                                + " " + flower.getCost());
                    });

                    reader.readAccessoryToStore(store);
                    store.getAccessories().forEach(good -> {
                        Accessory accessory = (Accessory) good;
                        System.out.println(accessory.getId() + " " + accessory.getColor() + " "
                                + accessory.getAccessoryKind() + " " + accessory.getCost());
                    });
                    System.out.println("What do you prefer to add to your bouquet? Please, enter the ID below");
                    System.out.println("input \"end\" to stop making a bouquet");
                    break;
                case "exit":
                    runFlag = false;
                    System.out.println("Store is offline");
                    break;
                case "end":
                    if (currentBouquet != null && currentBouquet.size() > 0) {
                        Bouquet bouquet = new Bouquet(currentBouquet);

////                        List<DateItem> dateList = new ArrayList<>();                       
//                        Collections.
//                        bouquet.forEach(shipmentDate -> {
//                            System.out.println(bouquet.shipmentDate);
//                        });

                        bouquet.printCheck();
                        System.out.println("The bouquet prize is:" + " " + bouquet.calculatePrice());

                        System.out.println("enter the left bound and the right bound of the flowerLength interval");
                        Integer lb = Integer.valueOf(br.readLine());
                        Integer rb = Integer.valueOf(br.readLine());
                        flowerInInterval = new ArrayList<Flower>((bouquet.getFlowersInInterval(lb, rb)));
                        if (flowerInInterval.size() > 0) {
                            System.out.println("The flowers in the bouquet with the length between " + lb + " and " + rb
                                    + " are: ");
                            for (int i = 0; i < flowerInInterval.size(); i++) {
                                System.out.println(
                                        flowerInInterval.get(i).getId() + " " + flowerInInterval.get(i).getFlowerKind()
                                                + " " + "Length =  " + flowerInInterval.get(i).getLength().getLength());
                            }
                        } else {
                            System.out.println("There is no flower with the length between" + lb + " and " + rb);
                        }

                        currentBouquet = null;

                    } else {
                        System.out.println("add flowers to bouquet");
                    }
                    System.out.println("Enter \"new\" to start making a bouquet or \"exit\" to close the store");

                    break;

                default: {
                    if (currentBouquet == null) {
                        currentBouquet = new ArrayList<>();
                    }
                    Flower flower = store.findFlowerById(Integer.valueOf(s));
                    Accessory accessory = store.findAccessoryById(Integer.valueOf(s));
                    if (flower != null) {
                        currentBouquet.add(flower);
                    } else if (accessory != null) {
                        currentBouquet.add(accessory);
                    } else {
                        System.out.println("Wrong ID");
                    }

                }

                }

            } catch (NumberFormatException e) {

                System.out.println("Wrong input");
            } catch (IOException e) {

                e.printStackTrace();
            }
        }

    }
}