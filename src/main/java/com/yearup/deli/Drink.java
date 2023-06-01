package com.yearup.deli;

import java.util.ArrayList;

public class Drink {
    private String size;
    private String flavor;
    private double price;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public String printDrinkOrder() {
        StringBuilder str = new StringBuilder();
        str.append("Size: ").append(size).append("\n");
        str.append("Flavor: ").append(flavor).append("\n");
        str.append("Price: $").append(price);
        return str.toString();
    }

    // create a method for get price and drink size
    public double getPrice() {
        double drinkPrice = 0.0;
        if (size.equalsIgnoreCase("small")) {
            drinkPrice = 1.0;
        } else if (size.equalsIgnoreCase("medium")) {
            drinkPrice = 2.0;
        } else if (size.equalsIgnoreCase("large")) {
            drinkPrice = 3.0;

        }
        return drinkPrice;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "size='" + size + '\'' +
                ", flavor='" + flavor + '\'' +
                ", price=" + price +
                '}';
    }
}

