package com.aakash.inheritance;

public class Triangle extends Shape {


    public Triangle(String color) {
        super(color);
    }

    // public > protected > package-package > private
    @Override
    public void rotate() {
        super.rotate();
        System.out.println("The Triangle Shape");
    }
}
