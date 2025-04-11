package com.aakash.inheritance;

public class Circle extends Shape{

    @Override
    public void rotate() {
        super.rotate();
        System.out.println("The Circle Shape");
    }
}
