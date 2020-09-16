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
import java.util.List;
import java.util.Scanner;

public class Office {

    private Store store;

    private boolean runFlag = true;

    private ReadFromJSON reader;

    List<Good> currentBouquet;
    
    Integer calculatePrice;

    public Office() {
        store = new Store();
        reader = new ReadFromJSON();
    }

    public void run() {
        reader.readFlowerToStore(store);
        System.out.println("Hello! Today our product range offers:");
        store.getFlowers().forEach(good -> {
            Flower flower = (Flower) good;
            System.out.println(flower.getId() + " " + flower.getColor() + "  " + flower.getFlowerKind());
            System.out.println(flower.getLength());
            System.out.println(flower.getCost());
            System.out.println(flower.getShipmentDate());

        });

        reader.readAccessoryToStore(store);
        store.getAccessories().forEach(good -> {
            Accessory accessory = (Accessory) good;
            System.out.println(accessory.getId() + " " + accessory.getColor() + " " + accessory.getAccessoryKind() + " "
                    + accessory.getCost());
        });

        System.out.println("Which flower do you prefer to add to your bouquet? Please, enter the ID below");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;

        while (runFlag) {

            try {
                s = br.readLine();
                switch (s) {
                case "exit":
                    runFlag = false;
                    System.out.println("Store is offline");
                    break;
                case "end":
                    if (currentBouquet != null && currentBouquet.size() > 0) {
                        Bouquet bouquet = new Bouquet(currentBouquet);
                        currentBouquet = null;
                    }else
                        System.out.println("add flowers to bouquet");

                    break;

                default: {
                    if (currentBouquet == null) {
                        currentBouquet = new ArrayList();
                    }
                    Flower flower = store.findFlowerById(Integer.valueOf(s));

                    if (flower != null) {
                        currentBouquet.add(flower);
                    }

                }

                }

                // System.out.println((Store.findFlowerById((Integer.valueOf(s)),
                // flower.getFlowers())).getCost());

                // id.add(Integer.parseInt(s));

            } catch (NumberFormatException e) {

                System.out.println("Wrong input");
            } catch (IOException e) {

                e.printStackTrace();
            }
        }

//            int n = bouquet.size();
//            Integer cost = 0;
//          for(int i=0; i<n; i++) {
//              cost=cost + bouquet[i].getFlowers().getCost();
//              System.out.println((bouquet.get(i)) + "b ");
//          }
//        int n = id.size();
//        for(int i=0; i<n; i++) {
//            System.out.println(id.get(i));
//        }

//        Scanner scanner = new Scanner(System.in);
//        while (runFlag) {
//            System.out.println("Input smth, or \"exit\" for exit");
//            String input = scanner.next();
//            switch (input) {
//                case "exit" : runFlag = false;
//                System.out.println("Store is offline");
//                break;
//                default : {
//                    System.out.println("Store is online");
//                }
//
//            }
//        }
//        loader.writeFromStoreToFile(store);
    }
}