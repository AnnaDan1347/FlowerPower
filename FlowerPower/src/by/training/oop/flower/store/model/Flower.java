package by.training.oop.flower.store.model;

import by.training.oop.flower.store.enums.FlowerKind;

import java.time.LocalDate;

public class Flower extends Good {
    FlowerKind flowerKind;
    LocalDate shipmentDate;
    FlowerLength length;

    public FlowerKind getFlowerKind() {
        return flowerKind;
    }

    public void setFlowerKind(FlowerKind flowerKind) {
        this.flowerKind = flowerKind;
    }

    public LocalDate getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(LocalDate shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public FlowerLength getLength() {
        return length;
    }

    public void setLength(FlowerLength length) {
        this.length = length;
    }

    public boolean isInInterval(int leftBound, int rightBound) {
        return length.getLength() >= leftBound && length.getLength() <= rightBound;
    }

    public static Color getColor(String string) {
        // TODO Auto-generated method stub
        return null;
    }
}