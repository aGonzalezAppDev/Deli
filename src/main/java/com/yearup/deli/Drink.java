package com.yearup.deli;

public class Drink {

    private String size;

    public Drink( String size) {

        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



    @Override
    public String toString() {
        return "Drink{" +
                ", size='" + size + '\'' +
                '}';
    }
}

