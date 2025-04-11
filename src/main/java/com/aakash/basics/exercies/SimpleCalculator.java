package com.aakash.basics.exercies;

import java.util.Scanner;

/*
Concept: Build a command-line calculator that performs basic arithmetic operations (addition, subtraction, multiplication, division).

Features:

Accept user input for two numbers and an operator (+, -, *, /).
Use Scanner for input and if/else or switch to determine the operation.
Handle errors like division by zero using conditionals.

Skills Practiced:

Input/Output (Scanner class).
Arithmetic operations.
Conditional logic.
*/
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;

        do {
            String banner = """
                    ****************************
                    Welcome to Simple Calculator
                    ****************************
                   \s
                    Follow the instructions below
                    You will be asked to enter two numbers one after the other
                    Only integer values are supported
                    Then you will be asked to enter the operator you want to use
                    These operators are supported:
                    + for addition
                    - for subtraction
                    * for multiplication
                    / for division
                   \s
                   *******************************
                    Enter 'q' to exit the calculator
                   \s""";

            System.out.println(banner);

            System.out.println("Enter first number or q to quit:");
            input = in.nextLine();
            if (input.equalsIgnoreCase("q")){
                break;
            }
            int firstNumber = Integer.parseInt(input);

            System.out.println("Enter second number or q to quit");
            input = in.nextLine();
            if (input.equalsIgnoreCase("q")){
                break;
            }
            int secondNumber = Integer.parseInt(input);

            System.out.println("Enter operator or q to quit");
            input = in.nextLine();
            if (input.equalsIgnoreCase("q")){
                break;
            }

            int result = switch (input){
                case "+" -> firstNumber + secondNumber;
                case "-" -> firstNumber - secondNumber;
                case "*" -> firstNumber * secondNumber;
                case "/" -> {
                    if (secondNumber == 0){
                        System.out.println("Can't divide by zero");
                        yield Integer.MIN_VALUE;
                    }
                    yield  firstNumber / secondNumber;
                }
                default -> {
                    System.out.println("Wrong operator provided, please exiting loop");
                    yield Integer.MIN_VALUE;
                }
            };

            if (result != Integer.MIN_VALUE){
                System.out.println(firstNumber  + " " + input + " " + secondNumber + " = " + result);
            }

            System.out.println("Do you want to perform another calculation ? (Enter: 'y' to continue 'q' to quit)");
            input = in.nextLine();
            if (!input.equalsIgnoreCase("q")){
                System.out.println("Let's perform one more calculation");
            }

        }while (!input.equalsIgnoreCase("q"));

        in.close();
    }


}
