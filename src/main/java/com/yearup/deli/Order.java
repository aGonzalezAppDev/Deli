package com.yearup.deli;

import java.util.ArrayList;

public class Order {
    private int numOfOrder;
    private ArrayList<Sandwich> sandwiches;
    private ArrayList<String> drinks;

    public Order(int numOfOrder) {
        this.numOfOrder = numOfOrder;
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    public int getNumOfOrder() {
        return numOfOrder;
    }

    public ArrayList<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public ArrayList<String> getDrinks() {
        return drinks;
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
