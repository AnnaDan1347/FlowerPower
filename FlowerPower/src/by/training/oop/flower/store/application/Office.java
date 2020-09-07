package by.training.oop.flower.store.application;

import by.training.oop.flower.store.model.Flower;
import by.training.oop.flower.store.prices.CreatingJSONDocument;

import java.util.List;
import java.util.Scanner;

public class Office {

    private Store store;

    private boolean runFlag = true;

    public void run() {
        store = new Store();
        CreatingJSONDocument loader = new CreatingJSONDocument();
        loader.readFileToStore(store);
        store.getGoods().forEach(good -> {
            Flower flower = (Flower) good;
            System.out.println(flower.getFlowerKind());
            System.out.println(flower.getLength());
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