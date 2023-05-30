package com.yearup.deli;

public class Drink {
    private double price;
    private String size;

    public Drink(double price, String size) {
        this.price = price;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
// Add to Order
   /* public void calculatePrice() {
        switch (size.toLowerCase()) {
            case "small":
                price = 2.00;
                break;
            case "medium":
                price = 2.50;
                break;
            case "large":
                price = 3.00;
                break;
            default:
                System.out.println("Invalid size. Setting default price.");
                break;
        }
    }*/

}
