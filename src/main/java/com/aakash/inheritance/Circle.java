package com.aakash.inheritance;

public class Circle extends Shape{

    public Circle(String color) {
        super(color);
    }

    @Override
    public void rotate() {
        super.rotate();
        System.out.println("The Circle Shape : ");
    }
}
