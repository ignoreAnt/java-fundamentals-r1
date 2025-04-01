package com.aakash.challenges;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNoOfOperations = 4;
        while(maxNoOfOperations > 0) {
            System.out.println("Enter any two numbers for the operation:");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            input.nextLine();
            System.out.println("Enter the operator: ");
            String op = input.nextLine().trim();
            int result = switch (op) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> {
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                        yield 0;
                    }
                     yield num1 / num2;
                }
                default -> {
                    System.out.println("Invalid input");
                    yield 0;
                }
            };
            System.out.println(result + " is the result for your operation");
            maxNoOfOperations--;
        }
        input.close();
    }
}
