package by.training.oop.flower.store.application;

import by.training.oop.flower.store.model.Good;

import java.util.List;

public class Store {
    private List<Good> goods;


    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }
}
