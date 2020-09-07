package by.training.oop.flower.store.enums;

import by.training.oop.flower.store.model.FlowerLength;

public enum FlowerKind {
    ROSE(""),
    LILAC(""),
    TULIP(""),
    CHRIZANTHEMUM(""),
    OTHER_FLOWER("");

    private String name;

    FlowerKind(String name) {
        this.name = name;
    }

    public static FlowerKind getFlowerKind(String name) {
        for(var item: FlowerKind.values()){
            if (name.equals(item.name())) {
                return item;
            }
        }
        return OTHER_FLOWER;
    }
}