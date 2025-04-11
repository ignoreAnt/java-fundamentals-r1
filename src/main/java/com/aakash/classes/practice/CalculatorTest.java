package com.aakash.classes.practice;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1, 2, "+");
        calculator.add(1.0, 2.1, "+");
        calculator.add(1, 2.1, "+");
    }
}
