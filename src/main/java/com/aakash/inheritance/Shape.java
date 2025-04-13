package com.aakash.inheritance;

public class Shape {

    private int noOfSides;
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public int getNoOfSides() {
        return noOfSides;
    }

    public void setNoOfSides(int noOfSides) {
        this.noOfSides = noOfSides;
    }

    public String getColor() {
        return color;
    }

    public void rotate(){
        System.out.print("Rotating : ");
    }
}
