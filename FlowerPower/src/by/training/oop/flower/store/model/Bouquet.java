package by.training.oop.flower.store.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;




public class Bouquet {

    List<Good> positions;

    static class DateItem {
        String datetime;
    }

    public Bouquet(List<Good> positions) {
        this.positions = positions;
    }

    public List<Flower> getFlowersInInterval(int leftBound, int rightBound) {
        return positions.stream().filter(good -> good instanceof Flower).map(good -> (Flower) good)
                .filter(flower -> flower.isInInterval(leftBound, rightBound)).collect(Collectors.toList());
    }

    public Integer calculatePrice() {
        return positions.stream().mapToInt(good -> good.getCost()).sum();
    }

    public void printCheck() {
        System.out.println("Check");
        positions.stream().forEach(good -> System.out.println(good.getId() + " " + good.getCost()));

    }

//       Flower a, b;
//       positions.stream()
//       .filter(good -> good instanceof Flower)
//       .map(good -> (Flower) good)
//        .sorted(flower::compareByPrice)
//        .forEach(good->System.out.printf("%s (%s) - %d \n", 
//                good.getId(), good.getFlowerKind(), good.getShipmentDate()));
    // }

//         positions.stream()
//         .filter(good -> good instanceof Flower)
//         .map(good -> (Flower) good)
//         .sorted()
//        .sorted(Comparator.comparing(Flower::getShipmentDate)).forEach(flower -> 
//        System.out.println(flower.getShipmentDate()));
//                
//
//    }

//    public static class SortByDate implements Comparator<DateItem> {
//        @Override
//        public int compare(DateItem a, DateItem b) {
//            return a.datetime.compareTo(b.datetime);
//        }
//
//    private Comparator<? super Flower> Comparator(Object object) {
//        // TODO Auto-generated method stub
//        return null;
//    }

}