package com.yearup.deli;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String bread;
    private int size;
    private List<String> meatToppings;
    private List<String> cheeseToppings;
    private List<String> otherToppings;
    private List<String> sauces;
    private String toasted;
    private boolean extraMeat;
    private boolean extraCheese;


    public Sandwich(String bread, int size, List<String> meatToppings, List<String> cheeseToppings, List<String> otherToppings, List<String> sauces, String toasted, boolean extraMeat, boolean extraCheese) {
        this.bread = bread;
        this.size = size;
        this.meatToppings = meatToppings;
        this.cheeseToppings = cheeseToppings;
        this.otherToppings = otherToppings;
        this.sauces = sauces;
        this.toasted = toasted;
        this.extraMeat = false;
        this.extraCheese = false;
    }

    // getters and setters


    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<String> getMeatToppings() {
        return meatToppings;
    }

    public void setMeatToppings(List<String> meatToppings) {
        this.meatToppings = meatToppings;
    }

    public List<String> getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(List<String> cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public List<String> getOtherToppings() {
        return otherToppings;
    }

    public void setOtherToppings(List<String> otherToppings) {
        this.otherToppings = otherToppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }

    public String getToasted() {
        return toasted;
    }

    public void setToasted(String toasted) {
        this.toasted = toasted;
    }

    // StringBuilder
    public String printOrderDetails() {
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

        return str.toString();
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

        if((size == 4) && (extraMeat = true)){
            totalPrice += 0.50;
        } else if ((size == 8) && (extraMeat = true)){
            totalPrice += 1.00;
        } else if ((size == 12) && (extraMeat = true)){
            totalPrice += 1.50;
        }

        if((size == 4) && (extraCheese = true )) {
            totalPrice += 0.30;
        } else if ((size == 8) && (extraCheese = true)) {
            totalPrice += 0.60;
        } else if ((size == 12) && (extraCheese = true)) {
            totalPrice += 0.90;
        }

        return totalPrice;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", size=" + size +
                ", meatToppings=" + meatToppings +
                ", cheeseToppings=" + cheeseToppings +
                ", otherToppings=" + otherToppings +
                ", sauces=" + sauces +
                ", toasted='" + toasted + '\'' +
                '}';
    }
}
