package by.training.oop.flower.store.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//класс находит цветок с длиной стебля из заданного интервала
public class Bouquet {
    
    List<Good> positions;
    Map<Integer, Integer> priceList;

    public List<Flower> getFlowersInInterval(int leftBound, int rightBound) {
        return positions.stream()
                .filter(good -> good instanceof Flower)
                .map(good -> (Flower) good)
                .filter(flower -> flower.isInInterval(leftBound, rightBound))
                .collect(Collectors.toList());
    }

    public Integer calculatePrice() {
        return positions.stream()
                .mapToInt(good -> priceList.get(good))
                .sum();
    }
}