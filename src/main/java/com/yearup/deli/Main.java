package com.yearup.deli;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Order order = new Order();
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
        //order = new Order();
        System.out.println("Welcome to the Deli");
        System.out.println("-----------------------------------------");
        System.out.println("1. Add Sandwich");
        System.out.println("2. Add Drink");
        System.out.println("3. Add Chips");
        System.out.println("4. Checkout");
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
                checkOut(scanner);
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
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter a another meat topping or exit to stop");
            meats = scanner.nextLine();
            if (meats.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                meatToppings.add(meats);
                System.out.println(meatToppings);
            }
        }
        System.out.println("Cheese Options: American, Provolone, Cheddar, Swiss");
        System.out.println("-----------------------------------------");
        System.out.print("Please enter a type of cheese:");

        String cheese = scanner.nextLine();
        cheeseToppings.add(cheese);
        scanner.nextLine();

        System.out.print("Would you like extra cheese? (yes/no)");
        System.out.println("-----------------------------------------");
        boolean extraCheese = scanner.nextLine().equalsIgnoreCase("yes");


        exit = false;
        while (!exit) {
            System.out.println("Enter a another cheese topping or exit to stop");
            cheese = scanner.nextLine();
            if (cheese.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                cheeseToppings.add(cheese);
                System.out.println(cheeseToppings);
            }
        }

        System.out.println("Regular Topping Options: Lettuce, Peppers, Onions, Tomatoes, Jalepenos, Cucumbers, Pickles, Guacamole, Mushrooms");
        System.out.println("-----------------------------------------");
        System.out.print("Please enter toppings: ");

        String regularToppings = scanner.nextLine();
        otherToppings.add(regularToppings);
        scanner.nextLine();

        exit = false;
        while (!exit) {
            System.out.println("Enter a another Regular topping or exit to stop");
            regularToppings = scanner.nextLine();
            if (regularToppings.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                otherToppings.add(regularToppings);
                System.out.println(otherToppings);
            }
        }

        System.out.println("Sauce Options: Mayo, Mustard, Ketchup, Ranch, Thousand Islands, Vinaigrette");
        System.out.println("-----------------------------------------");
        System.out.print("Please enter a sauce:");

        String sauce = scanner.nextLine();
        sauces.add(sauce);
        scanner.nextLine();

        exit = false;
        while (!exit) {
            System.out.println("Enter a another sauce or exit to stop");
            sauce = scanner.nextLine();
            if (sauce.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                sauces.add(sauce);
                System.out.println(sauces);
            }
        }

        System.out.print("Would you like the sandwich to be toasted? (yes/no)");
        System.out.println("-----------------------------------------");
        String toasted = scanner.nextLine();

        Sandwich sandwich = new Sandwich(bread, sandwichSize, meatToppings, cheeseToppings, otherToppings, sauces, toasted, extraMeats, extraCheese);
        order.addSandwich(sandwich);

        System.out.println("Order successfully added!");

        StringBuilder str = new StringBuilder();
        str.append("Bread: ").append(bread).append("\n");
        str.append("Size: ").append(sandwichSize).append("\n");
        str.append("Meat Toppings: ").append(meatToppings).append("\n");
        str.append("Cheese Toppings: ").append(cheeseToppings).append("\n");
        str.append("Other Toppings: ").append(otherToppings).append("\n");
        str.append("Sauce: ").append(sauces).append("\n");
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

    public static void checkOut(Scanner scanner) {
        ReceiptFileManager rfm = new ReceiptFileManager();
        //Add a switch
        //use the order that we already have Order totalOrder = new Order(orders.getNumOfOrder());
/*
        String orderDetails = order.printOrderDetails();
        System.out.println("Order Details: ");
        System.out.println(orderDetails);

        double total = order.getTotalPrice();
        System.out.println("Total: $" + total);
*/

        for (Sandwich sandwich : order.getSandwiches()) {
            System.out.println(sandwich);
        }
        // write drink details
        for (Drink drink : order.getDrinks()) {
            System.out.println(drink);
        }
        // write chips details
        for (Chips chips : order.getChipsList()) {
            System.out.println(chips);
        }

        System.out.println("1. Confirm your order");
        System.out.println("0. Cancel order");
        System.out.print("Enter you choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("saving file");
                try {
                    rfm.saveOrder(order);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 0:
                System.out.println("order canceled.");
                break;
            default:
                System.out.println("Invalid option. Try again.");
                displayAddScreen(scanner);
                break;
        }
    }
}

