package com.yearup.deli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //static ArrayList<Order> newOrders = new ArrayList<>();
    private static Order order;
    Scanner scanner;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Welcome to the Deli");
            System.out.println("-----------------------------------------");
            System.out.println("1. New Order");
            System.out.println("0. Exit");
            System.out.print("Enter you choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayAddScreen(input);
                    break;
                case 0:
                    System.out.println("Exit out of the application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    return;
            }
        }
    }

    public static void displayAddScreen(Scanner scanner) {
        order = new Order();
        System.out.println("Welcome to the Deli");
        System.out.println("-----------------------------------------");
        System.out.println("1. Add Sandwich");
        System.out.println("2. Add Drink");
        System.out.println("3. Add Chips");
        System.out.println("4. Checkout");
        System.out.println("0. Cancel Order");
        System.out.print("Enter you choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sandwich Options");
                displayAddSandwich(scanner);
                break;
            case 2:
                displayAddDrink(scanner);
                break;
            case 3:
                displayAddChips(scanner);
                break;
            case 4:
                //checkOut();
                break;
            case 0:
                //cancelOrder();
                break;

            default:
                System.out.println("Invalid option. Try again.");
                displayAddScreen(scanner);
                break;
        }
    }

    public static void displayAddSandwich(Scanner scanner) {

        List<String> meatToppings = new ArrayList<>();
        List<String> cheeseToppings = new ArrayList<>();
        List<String> otherToppings = new ArrayList<>();
        List<String> sauces = new ArrayList<>();


        scanner.nextLine();
        System.out.println("Bread options: White, Wheat, Rye, Wrap.");
        System.out.println("-----------------------------------------");
        System.out.print("Please enter the name of bread:");

        String bread = scanner.nextLine();

        System.out.println("Sandwich sizes(Goes by inch): 4, 8, 12.");
        System.out.println("-----------------------------------------");
        System.out.print("Please enter sandwich size:");
        int sandwichSize = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Meat Options: Steak, Ham, Salami, Roast Beef, Chicken, Bacon.");
        System.out.println("-----------------------------------------");
        System.out.print("Please enter a type of meat:");
        String meats = scanner.nextLine();
        meatToppings.add(meats);

        System.out.print("Would you like extra meat? (yes/no)");
        System.out.println("-----------------------------------------");
        boolean extraMeats = scanner.nextLine().equalsIgnoreCase("yes");


        System.out.println("Cheese Options: American, Provolone, Cheddar, Swiss");
        System.out.println("-----------------------------------------");
        System.out.print("Please enter a type of cheese:");

        String cheese = scanner.nextLine();
        cheeseToppings.add(cheese);
        scanner.nextLine();

        System.out.print("Would you like extra cheese? (yes/no)");
        System.out.println("-----------------------------------------");
        boolean extraCheese = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Regular Topping Options: Lettuce, Peppers, Onions, Tomatoes, Jalepenos, Cucumbers, Pickles, Guacamole, Mushrooms");
        System.out.println("-----------------------------------------");
        System.out.print("Please enter toppings: ");

        String regularToppings = scanner.nextLine();
        otherToppings.add(regularToppings);

        System.out.println("Sauce Options: Mayo, Mustard, Ketchup, Ranch, Thousand Islands, Vinaigrette");
        System.out.println("-----------------------------------------");
        System.out.print("Please enter a sauce:");

        String sauce = scanner.nextLine();
        sauces.add(sauce);

        System.out.print("Would you like the sandwich to be toasted? (yes/no)");
        System.out.println("-----------------------------------------");
        String toasted = scanner.nextLine();

        Sandwich sandwich = new Sandwich(bread, sandwichSize, meatToppings, cheeseToppings,otherToppings,sauces, toasted);
        order.addSandwich(sandwich);

        System.out.println("Order successfully added!");

        StringBuilder str = new StringBuilder();
        str.append("Bread: ").append(bread).append("\n");
        str.append("Size: ").append(sandwichSize).append("\n");
        str.append("Meat Toppings: ").append(meats).append("\n");
        str.append("Cheese Toppings: ").append(cheese).append("\n");
        str.append("Other Toppings: ").append(regularToppings).append("\n");
        str.append("Sauce: ").append(sauce).append("\n");
        str.append("Toasted: ").append(toasted).append("\n");
        // print string
        System.out.println(str.toString());
    }

    public static void displayAddDrink(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Please select drink size: Small, Medium, Large");
        System.out.println("-----------------------------------------");

        String drinkSize = scanner.nextLine();
        System.out.print("Please select drink flavor: Cola, Sprite, Pepsi");
        System.out.println("-----------------------------------------");
        String drinkFlavor = scanner.next();

        Drink drinkOrder = new Drink(drinkSize, drinkFlavor);
        order.addDrink(drinkOrder);

        System.out.println("Drink successfully added!");
    }

    public static void displayAddChips(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Would you like chips");
        System.out.println("-----------------------------------------");
        String chips = scanner.nextLine();

        Chips chipsOrder = new Chips(chips);
        order.addChips(chipsOrder);

        System.out.println("Chips successfully added!");
    }

    /* public void checkOut() {
             //Add a switch

        //use the order that we already have Order totalOrder = new Order(orders.getNumOfOrder());
        double total = totalOrder.getTotalPrice();
        System.out.println("Order detail: ");
        System.out.println(totalOrder);
        System.out.println("Total: $" + total);

        System.out.println("1. Confirm your order");
        System.out.println("0. Cancel order");
        System.out.print("Enter you choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                saveOrder();
        }
        } */
    public void printOrderDetails() {
    }
}
