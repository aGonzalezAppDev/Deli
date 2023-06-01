package com.yearup.deli;

public class Chips {
    private String chips;


    public Chips(String chips) {
        this.chips = chips;

    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }



    public StringBuilder printChipsOrder() {
        StringBuilder str = new StringBuilder();
        str.append("Chips: ").append(chips).append("\n");


        return str;
    }

    public double getPrice() {
    double chipPrice = 0.0;
     return 1.5;

    }
}

//get price return 1.50
// string builder