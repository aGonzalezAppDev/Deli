package com.yearup.deli;

import java.util.ArrayList;
import java.util.List;

public class Order {
    //private int numOfOrder;
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chipsList;
    private double price;

    public Order() {
        //this.numOfOrder = numOfOrder;
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

    /* public ArrayList<String> getChips() {
        return chips;
    } */
// totalprice inside of the order class 3 for loops
    /* public double getTotalPrice() {
        double totalPrice = 0;

        for (Sandwich sandwich : sandwiches) {
            totalPrice += sandwich.getTotalPriceOfSandwich();
        }
        for (Drink drink : drinks) {
        //    totalPrice += drink.getPrice();
        }
        if (chips == true) {
            totalPrice += 1.50;
        }
        return totalPrice;

    }*/
    // own price for the order total price
    // display total order
    // in the main class
    //if is correct checkout
    /* public void displayOrder() {
        System.out.println("Order Details:");
        for (Sandwich sandwich : sandwiches) {
            System.out.println("Sandwich size: " + sandwich.getSize());
            System.out.println("Toppings: " + sandwich.getToppings());
            System.out.println("Toasted: " + sandwich.getToasted());
        }
        System.out.println("Total cost: $" + getTotalPrice());
    }*/

    /* public void isOrderCorrect(Scanner scanner) {
        System.out.print("Is your order correct? ");
        boolean correct = scanner.nextBoolean();

        if (correct) {
            System.out.println("Thank you for confirm your order");
        } else {
            System.out.println("Incorrect order.");
        }

    } */

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }
    public void addDrink(Drink drink) {
        drinks.add(drink);
    }
// chips different class, Item class is abstract drinks, chips extends item Person class
    /* public void addChips(Order chip) {
        chips.add(String.valueOf(chip));
    } */
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
