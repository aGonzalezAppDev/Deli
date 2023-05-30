package com.yearup.deli;

import java.util.ArrayList;

public class Order {
    private int numOfOrder;
    private ArrayList<Sandwich> sandwiches;
    private ArrayList<Drink> drinks;
    private boolean chips;

    public Order(int numOfOrder) {
        this.numOfOrder = numOfOrder;
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = chips;

    }

    public int getNumOfOrder() {
        return numOfOrder;
    }

    public ArrayList<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public void addChips() {
        chips = true;
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (Sandwich sandwich : sandwiches) {
            totalPrice += sandwich.getPrice();
        }
        for (Drink drink : drinks) {
            totalPrice += drink.getPrice();
        }
        if (chips) {
            totalPrice += 1.50;
        }
        return totalPrice;
    }
    public void displayOrder() {
        // default
    }
    public void isOrderCorrect() {
        // default
    }
    public void totalPrice() {
    }
}
