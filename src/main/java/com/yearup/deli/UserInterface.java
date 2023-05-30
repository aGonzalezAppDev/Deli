package com.yearup.deli;

import java.util.ArrayList;
import java.util.Scanner;

    public class UserInterface {
        private ArrayList<Order> orders;
         private Scanner scanner;
         public UserInterface() {
             orders = new ArrayList<Order>();
             scanner = new Scanner(System.in);
         }
        public void displayHomeScreen() {
            System.out.println("Welcome to the Deli");
            System.out.println("1. View Orders");
            System.out.println("2. Add Order");
            System.out.println("3. Exit");
            System.out.print("Enter you choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayOrderScreen();
                    break;
                case 2:
                    displayAddScreen();
                    break;
                case 3:
                    System.out.println("Thank you for your order!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    displayHomeScreen();
                    break;
            }
        }
    public void displayOrderScreen() {
             if (orders.isEmpty()) {
                 System.out.println("No orders available.");
             } else {
                 System.out.println("Orders:");
                 for (int i = 0; i < orders.size(); i++) {
                     Order order = orders.get(i);
                     System.out.println((i + 1) + " " + order);
                 }
             }
             displayHomeScreen();
    }
    public void displayAddScreen() {
        scanner.nextLine();
        System.out.println(" ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayAddSandwich();
                break;
            case 2:
                displayAddDrink();
                break;
            case 3:
                displayAddChips();
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
        System.out.print("Please enter the name of bread:");
        String bread = scanner.nextLine();

        System.out.println("Sandwich sizes(Goes by inch): 4, 8, 12.");
        System.out.print("Please enter sandwich size:");
        int sandwichSize = scanner.nextInt();

        System.out.println("Meat Options: Steak, Ham, Salami, Roast Beef, Chicken, Bacon.");
        System.out.print("Please enter a type of meat:");
        String meats = scanner.nextLine();

        System.out.print("Would you like extra meat? (yes/no)");
        boolean extraMeats = scanner.nextBoolean();

        System.out.println("Cheese Options: American, Provolone, Cheddar, Swiss");
        System.out.print("Please enter a type of cheese:");
        String cheese = scanner.nextLine();

        System.out.print("Would you like extra cheese? (extra)");
        String extraCheese = scanner.nextLine();

        System.out.println("Regular Topping Options: Lettuce, Peppers, Onions, Tomatoes, Jalepenos, Cucumbers, Pickles, Guacamole, Mushrooms");
        System.out.print("Please enter toppings: ");
        String regularToppings = scanner.nextLine();

        System.out.println("Sauce Options: Mayo, Mustard, Ketchup, Ranch, Thousand Islands, Vinaigrette");
        System.out.print("Please enter a sauce:");
        String sauce = scanner.nextLine();

        System.out.print("Would you like the sandwich to be toasted? (yes/no)");
        boolean toasted = scanner.nextBoolean();

        Order sandwichOrder = new Order(bread, sandwichSize, meats, extraMeats,
                cheese, extraCheese, regularToppings, sauce, toasted);
        orders.add(sandwichOrder);

        System.out.println("Order successfully added!");
        displayHomeScreen();

    }
    public void displayAddDrink() {
        scanner.nextLine();
        System.out.print("Please select drink size:");
        int drinkSize = scanner.nextInt();
        System.out.print("Please select drink flavor:");
        String drinkFlavor = scanner.next();

        Order drinkOrder = new Order(drinkSize, drinkFlavor);
        orders.add(drinkOrder);

        System.out.println("Drink successfully added!");
        displayHomeScreen();
    }
    public void displayAddChips(){
        scanner.nextLine();
        System.out.print("Would you like chips");
        boolean chips = scanner.nextBoolean();

        Order chipsOrder = new Order(chips);

        System.out.println("Chips successfully added!");
        displayHomeScreen();
    }
}
