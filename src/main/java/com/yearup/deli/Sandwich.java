package com.yearup.deli;

import java.util.ArrayList;

public class Sandwich {
    private String bread;
    private int size;
    private ArrayList<String> meatToppings;
    private ArrayList<String> cheeseToppings;
    private ArrayList<String> otherToppings;
    private ArrayList<String> sauce;
    private String toasted;
    private boolean extraMeat;
    private boolean extraCheese;


    public Sandwich(String bread, int size, ArrayList<String> meatToppings, ArrayList<String> cheeseToppings, ArrayList<String> otherToppings, ArrayList<String> sauce, String toasted) {
        this.bread = bread;
        this.size = size;
        this.meatToppings = meatToppings;
        this.cheeseToppings = cheeseToppings;
        this.otherToppings = otherToppings;
        this.sauce = sauce;
        this.toasted = toasted;
        this.extraMeat = false;
        this.extraCheese = false;

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

    public ArrayList<String> getMeatToppings() {
        return meatToppings;
    }

    public void setMeatToppings(ArrayList<String> meatToppings) {
        this.meatToppings = meatToppings;
    }

    public ArrayList<String> getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(ArrayList<String> cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public ArrayList<String> getOtherToppings() {
        return otherToppings;
    }

    public void setOtherToppings(ArrayList<String> otherToppings) {
        this.otherToppings = otherToppings;
    }

    public ArrayList<String> getSauce() {
        return sauce;
    }

    public void setSauce(ArrayList<String> sauce) {
        this.sauce = sauce;
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
    public double getPrice(){
        double breadPrice = 0.0;
        if(size == 4) {
            breadPrice = 5.50;
        } else if(size == 8){
            breadPrice = 7.00;
        } else if(size == 12) {
            breadPrice = 8.50;
        }

        double meatPrice = 0.0;
        if(size == 4){
            meatPrice += meatToppings.size() * 1.00;
        } else if (size == 8){
            meatPrice += meatToppings.size() * 2.00;
        } else if (size ==12) {
            meatPrice += meatToppings.size() * 3.00;
        } else if (size == 4 && extraMeat == true){

        }

        double cheesePrice = 0.0;
        if(size == 4){
            cheesePrice += cheeseToppings.size() * 0.75;
        } else if (size == 8){
            cheesePrice += cheeseToppings.size() * 1.50;
        } else if (size ==12) {
            cheesePrice += cheeseToppings.size() * 2.25;
        }

        double totalPrice = breadPrice + meatPrice + cheesePrice;

        return totalPrice;
    }

}
