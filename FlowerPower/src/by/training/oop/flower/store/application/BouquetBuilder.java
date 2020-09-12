//package by.training.oop.flower.store.application;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
//
//import by.training.oop.flower.store.model.Flower;
//
//
//public class BouquetBuilder {
// // список цветов в букете
//    private List<Flower> flowersBouquetList = new ArrayList<Flower>();
//
//
//    private List<Integer> readFlowerIdFromConsole(String[] args) {
//
//        List<Integer> id = new ArrayList<Integer>();
//        try{
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
//            String s;
//            while ((s = reader.readLine()) != null) {
//          id.add(Integer.parseInt(s));
//            } 
//        }catch (IOException e) {
//                e.printStackTrace();
//            } return id;         
//        }
//            
//    public void addFlower(Flower flw) {
//        
//        flowersBouquetList.add(flw);
//        calculatePrice();
//    }
//    
//
//
//
//}
