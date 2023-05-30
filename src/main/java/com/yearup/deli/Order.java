package com.yearup.deli;

import java.util.ArrayList;

public class Order {
    private int numOfOrder;
    private ArrayList<Sandwich> sandwiches;
    private ArrayList<String> drinks;

    public Order(int numOfOrder, ArrayList<Sandwich> sandwiches, ArrayList<String> drinks) {
        this.numOfOrder = numOfOrder;
        this.sandwiches = sandwiches;
        this.drinks = drinks;
    }
    public void addChips() {
        // default
    }
    public void displayOrder() {
        // default
    }
    public void isOrderCorrect() {
        // default
    }
}
