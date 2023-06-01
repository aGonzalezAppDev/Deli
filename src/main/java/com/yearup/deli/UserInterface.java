package com.yearup.deli;

import java.util.ArrayList;
import java.util.Scanner;

    public class UserInterface {
        private ArrayList<Order> newOrders;
        private Order orders;
         private Scanner scanner;
         public UserInterface() {
             newOrders = new ArrayList<>();
             scanner = new Scanner(System.in);
         }
        public void displayHomeScreen() {
            System.out.println("Welcome to the Deli");
            System.out.println("-----------------------------------------");
            System.out.println("1. New Order");
            System.out.println("0. Exit");
            System.out.print("Enter you choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAddScreen();
                    break;

                case 0:
                    System.out.println("Exit out of the application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    displayHomeScreen();
                    break;
            }
        }


    public void displayAddScreen() {
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
                displayAddSandwich();
                break;
            case 2:
                displayAddDrink();
                break;
            case 3:
                displayAddChips();
                break;
            case 4:
                //checkOut();
                break;
            case 0:
                //cancelOrder();
                break;

            default:
                System.out.println("Invalid option. Try again.");
                displayAddScreen();
                break;
        }
    }
    public void displayAddSandwich() {
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

        System.out.print("Would you like extra meat? (yes/no)");
        System.out.println("-----------------------------------------");
        boolean extraMeats = scanner.nextLine().equalsIgnoreCase("yes");


        System.out.println("Cheese Options: American, Provolone, Cheddar, Swiss");
        System.out.println("-----------------------------------------");
        System.out.print("Please enter a type of cheese:");

        String cheese = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Would you like extra cheese? (yes/no)");
        System.out.println("-----------------------------------------");
        boolean extraCheese = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Regular Topping Options: Lettuce, Peppers, Onions, Tomatoes, Jalepenos, Cucumbers, Pickles, Guacamole, Mushrooms");
        System.out.println("-----------------------------------------");
        System.out.print("Please enter toppings: ");

        String regularToppings = scanner.nextLine();

        System.out.println("Sauce Options: Mayo, Mustard, Ketchup, Ranch, Thousand Islands, Vinaigrette");
        System.out.println("-----------------------------------------");
        System.out.print("Please enter a sauce:");

        String sauce = scanner.nextLine();

        System.out.print("Would you like the sandwich to be toasted? (yes/no)");
        System.out.println("-----------------------------------------");
        String toasted = scanner.nextLine();

        Sandwich sandwich = new Sandwich(bread,sandwichSize, toasted);
        orders.addSandwich(sandwich);

        System.out.println("Order successfully added!");
        displayHomeScreen();

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
    public void displayAddDrink() {
        scanner.nextLine();
        System.out.print("Please select drink size: Small, Medium, Large");
        System.out.println("-----------------------------------------");

        String drinkSize = scanner.nextLine();
        System.out.print("Please select drink flavor: Cola, Sprite, Pepsi");
        System.out.println("-----------------------------------------");
        String drinkFlavor = scanner.next();

        Drink drinkOrder = new Drink(drinkSize);
        orders.addDrink(drinkOrder);

        System.out.println("Drink successfully added!");
        displayHomeScreen();
    }

    public void displayAddChips(){
        scanner.nextLine();
        System.out.print("Would you like chips");
        System.out.println("-----------------------------------------");
        boolean chips = scanner.nextBoolean();

        Order chipsOrder = new Order(chips);

        System.out.println("Chips successfully added!");
        displayHomeScreen();
    }
    /*public void checkOut() {
             //Add a switch
        Order totalOrder = new Order(orders.getNumOfOrder());
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
        }*/
    public void printOrderDetails() {

    }
    }
