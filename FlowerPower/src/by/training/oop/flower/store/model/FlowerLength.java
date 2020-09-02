package by.training.oop.flower.store.model;

import java.util.List;

public enum FlowerLength {
    SHORT(10),
    MIDDLE(20),
    LONG(30);

    private int length;

    FlowerLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

}