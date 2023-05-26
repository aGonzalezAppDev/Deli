package com.yearup.deli;

import java.util.Scanner;

public class Sandwich {
    private double price;
    private String size;
    private String toppings;
    private boolean toasted;

    public Sandwich(double price, String size, String toppings, boolean toasted) {
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
    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    // method for choosing Toppings
    public String chooseToppings(){
        System.out.println("Which toppings would you like? : ");
        Scanner myScanner = new Scanner(System.in);
        String userInput = myScanner.nextLine();
        return userInput;

    }

    // method for toasting bread
    public void toast(){

    }



}
