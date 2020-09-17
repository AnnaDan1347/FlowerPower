package by.training.oop.flower.store.enums;

public enum FlowerKind {
    ROSE(""), LILAC(""), TULIP(""), CHRIZANTHEMUM(""), OTHER_FLOWER("");

    private String name;

    FlowerKind(String name) {
        this.setName(name);
    }

    public static FlowerKind getFlowerKind(String name) {
        for (var item : FlowerKind.values()) {
            if (name.equals(item.name())) {
                return item;
            }
        }
        return OTHER_FLOWER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}