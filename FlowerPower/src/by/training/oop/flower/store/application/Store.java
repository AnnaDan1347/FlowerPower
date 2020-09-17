package by.training.oop.flower.store.application;

import by.training.oop.flower.store.model.Accessory;
import by.training.oop.flower.store.model.Flower;
import by.training.oop.flower.store.model.Good;

import java.util.List;

public class Store {
    private List<Flower> flowers;
    private List<Accessory> accessories;

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public Flower findFlowerById(Integer name) {

        for (Flower flower : flowers) {

            if (flower.getId() == name) {
                return flower;
            }
        }
        return null;
    }

    public Accessory findAccessoryById(Integer name) {

        for (Accessory accessory : accessories) {

            if (accessory.getId() == name) {
                return accessory;
            }
        }
        return null;
    }
}
