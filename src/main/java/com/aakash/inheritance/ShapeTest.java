package com.aakash.inheritance;

public class ShapeTest {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        Square square = new Square();

        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        Shape[] shapes = {circle, square, triangle};

        for (Shape shape: shapes) {
            shape.rotate();
        }

    }
}
