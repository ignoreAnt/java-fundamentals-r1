package com.aakash.challenges;

import java.util.Scanner;


public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNoOfOperations = 4;
        while(maxNoOfOperations > 0) {
            try {
                System.out.println("Enter any two numbers for the operation:");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                input.nextLine(); // Consume the newline character

                System.out.println("Enter the operator: ");
                String op = input.nextLine().trim();

                int result = calculate(num1, num2, op);
                System.out.println(result + " is the result for your operation");
            } catch (InvalidOperationException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
            maxNoOfOperations--;
        }
        input.close();
    }

    private static int calculate(int num1, int num2, String op) throws InvalidOperationException {
        return switch (op) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                yield num1 / num2;
            }
            default -> throw new InvalidOperationException("Invalid input for operator: " + op);
        };
    }
}
