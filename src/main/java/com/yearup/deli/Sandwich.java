package com.yearup.deli;

import java.util.Scanner;

public class Sandwich {
    private double price;
    private String size;
    private String toppings;
    private boolean toasted;

    public Sandwich(String size, String toppings, boolean toasted) {
        this.price = price;
        this.size = size;
        this.toppings = toppings;
        this.toasted = false;
    }

    // getters and setters
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getToppings() {
        return toppings;
    }
    public void setToppings(String toppings) {
        this.toppings = toppings;
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


    // method for toasting bread
    public void toast(){
        toasted = true;
    }

    // method for price
    public double get4SandwichPrice(){
        if(size.equalsIgnoreCase("4\"")){
            price = 5.50;
        }
        return price;
    }
}
