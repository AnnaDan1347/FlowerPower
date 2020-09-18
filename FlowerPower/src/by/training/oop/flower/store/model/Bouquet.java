package by.training.oop.flower.store.model;

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
        System.out.println("***Check***");
        positions.stream().forEach(good -> System.out.println(good.getId() + " " + good.getCost()));
    }

    public List<Flower> getFlowersForSort() {
        return positions.stream().filter(good -> good instanceof Flower).map(good -> (Flower) good)
                .collect(Collectors.toList());
    }
}