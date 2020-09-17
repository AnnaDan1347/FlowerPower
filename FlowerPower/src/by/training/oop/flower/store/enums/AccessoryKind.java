package by.training.oop.flower.store.enums;

public enum AccessoryKind {

    RIBBON(""), PAPER(""), POSTCARD(""),

    OTHER_ACCESSORY("");

    private String name;

    AccessoryKind(String name) {
        this.setName(name);
    }

    public static AccessoryKind getAccessoryKind(String name) {
        for (var item : AccessoryKind.values()) {
            if (name.equals(item.name())) {
                return item;
            }
        }
        return OTHER_ACCESSORY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
