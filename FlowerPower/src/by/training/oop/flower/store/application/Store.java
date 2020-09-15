package by.training.oop.flower.store.application;

import by.training.oop.flower.store.model.Accessory;
import by.training.oop.flower.store.model.Flower;
import by.training.oop.flower.store.model.Good;

import java.util.List;

public class Store {
    public List<Flower> flowers;
    public  List<Accessory> accessories;


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
    public static Flower findFlowerById(
            Integer name, List<Flower> flowers) {

              for (Flower flower : flowers) {
                  
                  if (flower.getId().equals(name)) {
                      return flower;
                  }
              }
              return null;
          }
}
