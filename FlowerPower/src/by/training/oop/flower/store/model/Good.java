package by.training.oop.flower.store.model;

import java.awt.*;

public abstract class Good {
    private Color color;
    private Integer cost;

    public Integer getCost() {
        return cost;
    }



    public void setCost(Integer cost) {
        this.cost = cost;
    }



    public Color getColor() {
        return color;
    }



    public void setColor(Color color) {
        this.color = color;
    }

    //public void setColor(float red, float green, float blue) {
        //this.color = Color.getHSBColor(red, green, blue);
    //}

}