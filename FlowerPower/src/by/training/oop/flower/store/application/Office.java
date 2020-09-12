package by.training.oop.flower.store.application;

import by.training.oop.flower.store.model.Accessory;
import by.training.oop.flower.store.model.Flower;
import by.training.oop.flower.store.prices.ReadAccessoryFromJSON;
import by.training.oop.flower.store.prices.ReadFlowerFromJSON;

import java.util.List;
import java.util.Scanner;

public class Office {

    private Store flower;
    private Store accessory;

    private boolean runFlag = true;

    public void run() {
        flower = new Store();
        accessory = new Store();
        ReadFlowerFromJSON loader = new ReadFlowerFromJSON();
        loader.readFlowerToStore(flower);
        System.out.println("Hello! Today our product range offers:");
        flower.getFlowers().forEach(good -> {
            Flower flower = (Flower) good;
            System.out.println(flower.getId() + " " + flower.getColor() + "  " + flower.getFlowerKind());
            System.out.println(flower.getLength());
            System.out.println(flower.getCost());
            
        });
        System.out.println("Which flower do you prefer to add to your bouquet? Please, enter the ID below");
        

        ReadAccessoryFromJSON reader = new ReadAccessoryFromJSON();
        reader.readAccessoryToStore(accessory);
        accessory.getAccessories().forEach(good -> {
            Accessory accessory = (Accessory) good;
            System.out.println(accessory.getId()+ " " + accessory.getAccessoryKind() + accessory.getCost());            
        });
        
        
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