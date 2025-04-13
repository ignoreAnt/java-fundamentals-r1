package com.aakash.inheritance;

public class ShapeTest {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        Square square = new Square();

        Shape circle = new Circle("red");
        Shape square = new Square("Black");
        Shape triangle = new Triangle("blue");
        String s = "Hello";
        Shape[] shapes = {circle, square, triangle};

        for (Shape shape: shapes) {
            shape.rotate();
        }

    }
}
