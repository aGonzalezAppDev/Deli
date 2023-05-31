package com.yearup.deli;


import java.awt.*;
import java.util.ArrayList;

public class Sandwich {
    private String bread;
    private int size;
    private ArrayList<String> meatToppings;
    private ArrayList<String> cheeseToppings;
    private ArrayList<String> otherToppings;
    private String sauce;
    private boolean toasted;


    public Sandwich(String bread, int size, String sauce, boolean toasted) {
        this.bread = bread;
        this.size = size;
        this.meatToppings = new ArrayList<>();
        this.cheeseToppings = new ArrayList<>();
        this.otherToppings = new ArrayList<>();
        this.sauce = sauce;
        this.toasted = toasted;
    }

    // getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isToasted() {
        return toasted;
    }

    public boolean getToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    // method for toasting bread
    public void toast() {
        toasted = true;
    }

    // Create a StringBuilder object
    // using StringBuilder() constructor
    /*public void printOrderDetails() {
        StringBuilder str = new StringBuilder();
        bread = "wheat";
        size = 4;
        str.append(bread);
        str.append(size);
        // print string
        System.out.println(str);
    }*/


    // method for price

}
