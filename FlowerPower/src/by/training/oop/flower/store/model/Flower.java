package by.training.oop.flower.store.model;

import by.training.oop.flower.store.enums.FlowerKind;
import by.training.oop.flower.store.enums.FlowerLength;

import java.time.LocalDate;


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
    public int compareTo(Flower that) {
        int idCompare = this.getId().compareTo(that.getId());
        if (idCompare != 0)
            return idCompare;

        int flowerKindCompare = this.getFlowerKind().compareTo(that.getFlowerKind());
        if (flowerKindCompare != 0)
            return flowerKindCompare;

        int lengthCompare = this.getLength().compareTo(that.getLength());
        if (lengthCompare != 0)
            return lengthCompare;

        int colorCompare = this.getColor().compareTo(that.getColor());
        if (colorCompare != 0)
            return colorCompare;

        int shipmentDateCompare = this.getShipmentDate().compareTo(that.getShipmentDate());
        if (shipmentDateCompare != 0)
            return shipmentDateCompare;

        int priceCompare = this.getCost().compareTo(that.getCost());
        if (priceCompare != 0)
            return priceCompare;

        return shipmentDateCompare;
    }
}
