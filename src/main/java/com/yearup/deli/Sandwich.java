package com.yearup.deli;

import java.util.Scanner;

public class Sandwich {
    private double price;
    private int size;
    private String toppings;
    private boolean toasted;
    private double priceOfMeat;
    private double priceOfCheese;
    private double totalPriceOfSandwich;
    private double priceOfBread;
    private boolean extraMeatAdded;
    private boolean extraCheeseAdded;

    public Sandwich(int size, String toppings, boolean toasted) {
        this.price = price;
        this.size = size;
        this.toppings = toppings;
        this.toasted = false;
        this.extraMeatAdded = false;
        this.extraCheeseAdded = false;
    }

    // getters and setters
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
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
    public double getBreadPrice(){
        double priceOfBread = 0;
        if(size == 4){
            priceOfBread = 5.50;
        } else if(size == 8) {
            priceOfBread = 7.00;
        } else if(size == 12){
            priceOfBread = 8.50;
        }
        return priceOfBread;
    }

    public double getMeatPrice(){
        if(size == 4) {
            priceOfMeat = 1.00;
        } else if(size == 8){
            priceOfMeat= 2.00;
        } else if(size == 12){
            priceOfMeat = 3.00;
        }
        return priceOfMeat;
    }


    public double getCheesePrice(){
         double priceOfCheese = 0;
        if(size == 4){
            priceOfCheese = .75;
        } else if(size == 8){
            priceOfCheese = 1.50;
        } else if(size == 12){
            priceOfCheese = 2.25;
        }
        return priceOfCheese;
    }

    public double AddExtraMeat(){
        double priceOfExtraMeat = 0;
        if(size == 4){
            priceOfExtraMeat = .50;
        } else if(size == 8){
            priceOfExtraMeat = 1.00;
        } else if(size == 12){
            priceOfExtraMeat = 1.50;
        }
        double totalMeatPrice = 0;
        totalMeatPrice= priceOfMeat + priceOfExtraMeat;
        return totalMeatPrice;
    }

    public double AddExtraCheese(){
        double priceOfExtraCheese = 0;
        if(size ==4){
            priceOfExtraCheese = .30;
        } else if(size == 8){
            priceOfExtraCheese = .60;
        } else if(size == 12){
            priceOfExtraCheese = .90;
        }
        double totalCheesePrice = priceOfCheese + priceOfExtraCheese;
        return totalCheesePrice;
    }

    public double getTotalPriceOfSandwich(){
            totalPriceOfSandwich = priceOfBread + priceOfMeat + priceOfCheese;
            if(extraMeatAdded == true){
                 totalPriceOfSandwich = AddExtraMeat() + priceOfBread + priceOfCheese;
            }
            if(extraCheeseAdded == true){
                totalPriceOfSandwich = AddExtraCheese() + priceOfBread + priceOfMeat;
            }
        return totalPriceOfSandwich;
    }


}
