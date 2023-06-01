package com.yearup.deli;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chipsList;
    private double price;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chipsList = new ArrayList<>();
        this.price = 0.0;
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

// totalprice inside of the order class 3 for loops
    public double getTotalPrice() {
        double totalPrice = 0;

        for (Sandwich sandwich : sandwiches) {
            totalPrice += sandwich.getPrice();
        }
        for (Drink drink : drinks) {
            totalPrice += drink.getPrice();
        }
        for (Chips chips : chipsList) {
            totalPrice += 1.50;
        }
        return totalPrice;
    }
    public String printOrderDetails() {
        StringBuilder str = new StringBuilder();
        str.append("Sandwich").append("\n");
        for (Sandwich sandwich : sandwiches) {
            str.append(sandwich).append(", ");
        }
        str.append("\n");
        str.append("Drink").append("\n");
        for (Drink drink : drinks) {
            str.append(drink).append(", ");
        }
        str.append("\n");
        str.append("Chips").append("\n");
        for (Chips chips : chipsList) {
            str.append(chips).append(", ");
        }
        return str.toString();
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }
    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public List<Sandwich> displaySandwiches(){
        return sandwiches;
    }

    public void addChips(Chips chips) {
        this.chipsList.add(chips);
        this.price += 1.50;
    }

    public List<Chips> getChipsList() {
        return chipsList;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", sandwiches=" + sandwiches +
                ", drinks=" + drinks +
                ", chipsList=" + chipsList +
                ", price=" + price +
                '}';
    }
}
