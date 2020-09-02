package by.training.oop.flower.store.model;

import java.util.ArrayList;
import java.util.List;
//класс находит цветок с длиной стебля из заданного интервала
public class Bouquet {
    List<Good> positions;

    public List<Flower> getFlowersInInterval(int leftBound, int rightBound) {
        List<Flower> flowers = new ArrayList<>();
        for (Good position: positions) {
            if (position instanceof Flower) {
                if (((Flower) position).isInInterval(leftBound, rightBound)) {
                    flowers.add((Flower) position);
                }
            }
        }
        return flowers;
    }
}