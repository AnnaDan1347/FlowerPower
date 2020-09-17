package by.training.oop.flower.store.model;

import by.training.oop.flower.store.enums.FlowerKind;

import java.time.LocalDate;
import java.util.List;

public class Flower extends Good implements Comparable<Flower> {
    FlowerKind flowerKind;
    LocalDate shipmentDate;
    FlowerLength length;

    public LocalDate getShipmentDate() {
        return shipmentDate;
    }

    public FlowerKind getFlowerKind() {
        return flowerKind;
    }

    public void setFlowerKind(FlowerKind flowerKind) {
        this.flowerKind = flowerKind;
    }

    public static String getShipmentDate(String string) {
        return string;
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

    @Override

    public int compareTo(Flower f) {
        if (getShipmentDate() == null || f.getShipmentDate() == null)
            return 0;
        return getShipmentDate().compareTo(f.getShipmentDate());
    }
}
