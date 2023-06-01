package com.yearup.deli;


import java.awt.*;
import java.util.ArrayList;
public class Sandwich {
    private String bread;
    private int size;
    private ArrayList<String> meatToppings;
    private ArrayList<String> cheeseToppings;
    private ArrayList<String> otherToppings;
    private ArrayList<String> sauce;
    private String toasted;


    public Sandwich(String bread, int size, String toasted) {
        this.bread = bread;
        this.size = size;
        this.meatToppings = new ArrayList<>();
        this.cheeseToppings = new ArrayList<>();
        this.otherToppings = new ArrayList<>();
        this.sauce = new ArrayList<>();
        this.toasted = toasted;
    }

    // getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String isToasted() {
        return toasted;
    }

    public String getToasted() {
        return toasted;
    }

    public void setToasted(String toasted) {
        this.toasted = toasted;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }




    // Create a StringBuilder object
    // using StringBuilder() constructor
    public StringBuilder printOrderDetails() {
        StringBuilder str = new StringBuilder();
        str.append("Bread: " + bread).append("\n");
        str.append("Size: " + size).append("\n");
        str.append("Meat Toppings: " + meatToppings).append("\n");
        str.append("Cheese Toppings: " + cheeseToppings).append("\n");
        str.append(" Other Toppings: " + otherToppings).append("\n");
        str.append("Sauces: " + sauce).append("\n");
        str.append("Toasted: " + toasted);

        return str;
    }


    // method for price

    

}
