package by.training.oop.flower.store.enums;

public enum Color {
    ORANGE(""), RED(""), WHITE(""), YELLOW(""), OTHER_COLOR("");

    private String name;

    Color(String name) {
        this.setName(name);
    }

    public static Color getColor(String name) {
        for (var item : Color.values()) {
            if (name.equals(item.name())) {
                return item;
            }
        }
        return OTHER_COLOR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
