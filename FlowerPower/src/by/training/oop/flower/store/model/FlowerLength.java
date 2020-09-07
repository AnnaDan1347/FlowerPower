package by.training.oop.flower.store.model;

import java.util.List;

public enum FlowerLength {
    SHORT(10),
    MIDDLE(20),
    LONG(30),
    UNKNOWN(0);

    private final int length;

    FlowerLength(int length) {
        this.length = length;
    }

    public static FlowerLength getLength(String length) {

        for(var item: FlowerLength.values()){
            if (Integer.parseInt(length) == item.length) {
                return item;
            }
        }
        return UNKNOWN;
    }

    public int getLength() {
        return length;
    }

}