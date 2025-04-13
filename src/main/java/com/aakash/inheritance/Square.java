package com.aakash.inheritance;

public class Square extends Shape{

    public Square(String color) {
        super(color);
    }

    @Override
    public void rotate() {
        super.rotate();
//        System.out.println("Square is rotating");
        System.out.println("The Square Shape");
    }
}
