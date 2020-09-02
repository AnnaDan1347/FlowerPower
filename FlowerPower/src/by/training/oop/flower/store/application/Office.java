package by.training.oop.flower.store.application;

import by.training.oop.flower.store.prices.CreatingJSONDocument;

import java.util.Scanner;

public class Office {

    private boolean runFlag = true;

    public void run() {
        CreatingJSONDocument.FileWriter();
        Scanner scanner = new Scanner(System.in);
        while (runFlag) {
            System.out.println("Input smth, or \"exit\" for exit");
            String input = scanner.next();
            switch (input) {
                case "exit" : runFlag = false;
                System.out.println("Store is offline");
                break;
                default : {
                    System.out.println("Store is online");
                }
                
            }
        }
    } 
}