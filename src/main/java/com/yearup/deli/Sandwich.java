package com.yearup.deli;

import java.util.ArrayList;
public class Sandwich {
    private String bread;
    private int size;
    private ArrayList<String> meatToppings;
    private ArrayList<String> cheeseToppings;
    private ArrayList<String> otherToppings;
    private ArrayList<String> sauces;
    private String toasted;



    public Sandwich(String bread, int size, String toasted) {
        this.bread = bread;
        this.size = size;
        this.meatToppings = new ArrayList<>();
        this.cheeseToppings = new ArrayList<>();
        this.otherToppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
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
        return sauces;
    }

    public void setSauce(ArrayList<String> sauces) {
        this.sauces = sauces;
    }

    // StringBuilder
    public StringBuilder printOrderDetails() {
        StringBuilder str = new StringBuilder();
        str.append("Bread: " + bread).append("\n");
        str.append("Size: " + size).append("\n");
        str.append("Meat Toppings: ");
        for(String meats: meatToppings){
            str.append(meats).append(", ");
        }
        str.append("\n");
        str.append("Cheese Toppings: ");
        for(String cheeses: cheeseToppings){
            str.append(cheeses).append(", ");
        }
        str.append("\n");
        str.append(" Other Toppings: ");
        for(String toppings: otherToppings){
            str.append(toppings).append(", ");
        }
        str.append("\n");
        str.append("Sauces: ");
        for(String sauce: sauces){
            str.append(sauce).append(", ");
        }
        str.append("\n");
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
