package by.training.oop.flower.store.model;

import java.awt.*;

public abstract class Good {
    private Color color;
    private Integer cost;
    private Integer id; 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
    
    public static String getCost(String name) {
        return name;}
    
    public static String getId(String name) {
        return name;}


    public Color getColor() {
        return color;
    }



    public void setColor(Color color) {
        this.color = color;
    }
    
    public static Color getColor(String string) {
        return null;
    }
    //public void setColor(float red, float green, float blue) {
        //this.color = Color.getHSBColor(red, green, blue);
    //}

}