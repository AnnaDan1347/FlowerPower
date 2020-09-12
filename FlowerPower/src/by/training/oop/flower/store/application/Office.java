package by.training.oop.flower.store.application;

import by.training.oop.flower.store.model.Accessory;
import by.training.oop.flower.store.model.Flower;
import by.training.oop.flower.store.prices.ReadAccessoryFromJSON;
import by.training.oop.flower.store.prices.ReadFlowerFromJSON;

import java.util.List;
import java.util.Scanner;

public class Office {

    private Store store;

    private boolean runFlag = true;

    public void run() {
        store = new Store();
        ReadFlowerFromJSON loader = new ReadFlowerFromJSON();
        loader.readFileToStore(store);
        System.out.println("Hello! Today our product range offers:");
        store.getFlowers().forEach(good -> {
            Flower flower = (Flower) good;
            System.out.println(flower.getColor() + "  " + flower.getFlowerKind());
            System.out.println(flower.getLength());
            System.out.println(flower.getCost());
            
        });
        System.out.println("Which flower do you prefer to add to your bouquet? Please, enter the name below");
        

        ReadAccessoryFromJSON reader = new ReadAccessoryFromJSON();
        reader.readFileToStore(store);
        store.getAccessories().forEach(good -> {
            Accessory accessory = (Accessory) good;
            System.out.println(accessory.getAccessoryKind());            
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