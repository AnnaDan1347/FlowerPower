package by.training.oop.flower.store.model;

import by.training.oop.flower.store.enums.FlowerKind;

import java.time.LocalDate;
import java.util.List;

public class Flower extends Good {
    FlowerKind flowerKind;
    LocalDate shipmentDate;
    FlowerLength length;
//    Color color;
//    Integer cost;
//    Integer id;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

   
    public LocalDate getShipmentDate() {
        return shipmentDate;
    }

    public FlowerKind getFlowerKind() {
        return flowerKind;
    }

//    public Color getColor() {
//        return color;
//    }
//
//    public void setColor(Color color) {
//        this.color = color;
//    }
//
//    public Integer getCost() {
//        return cost;
//    }
//
//    public void setCost(Integer cost) {
//        this.cost = cost;
//    }
    
//    public static String getCost(String name) {
//        return name;}
//    
//    public static String getId(String name) {
//        return name;}

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
}



//    public static String getShipmentDate(String name) {
//        return name;}

//    public static Color getColor(String string) {
//        // TODO Auto-generated method stub
//        return null;
//    }



