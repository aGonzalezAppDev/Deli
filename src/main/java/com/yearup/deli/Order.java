package com.yearup.deli;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private int numOfOrder;
    private ArrayList<Sandwich> sandwiches;
    private ArrayList<Drink> drinks;
    private boolean chips;

    public Order(int numOfOrder) {
        this.numOfOrder = numOfOrder;
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    public Order(boolean chips) {
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
        chips = false;
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (Sandwich sandwich : sandwiches) {
            totalPrice += sandwich.getTotalPriceOfSandwich();
        }
        for (Drink drink : drinks) {
            totalPrice += drink.getPrice();
        }
        if (chips == true) {
            totalPrice += 1.50;
        }
        return totalPrice;

    }
    
    public void displayOrder() {
        System.out.println("Order Details:");
        for (Sandwich sandwich : sandwiches) {
            System.out.println("Sandwich size: " + sandwich.getSize());
            System.out.println("Toppings: " + sandwich.getToppings());
            System.out.println("Toasted: " + sandwich.getToasted());
        }
        System.out.println("Total cost: $" + getTotalPrice());
    }
    public void isOrderCorrect(Scanner scanner) {
        System.out.print("Is your order correct? ");
        boolean correct = scanner.nextBoolean();

        if (correct) {
            System.out.println("Thank you for confirm your order");
        } else {
            System.out.println("Incorrect order.");
        }
    }
}
