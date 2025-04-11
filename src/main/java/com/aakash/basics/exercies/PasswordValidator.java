package com.aakash.basics.exercies;

import java.util.Scanner;

/*
Password Validator
Concept: Build a program that validates a user's password based on certain criteria.

Features:

Check if the password meets requirements like minimum length, presence of uppercase/lowercase letters, and digits.
Use if/else or switch statements to validate each criterion.
Provide feedback to the user about what is missing.

Skills Practiced:

String methods (length, matches, contains).
Conditional logic.
Input/Output for user interaction.
*/
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();
        int MAX_PASSWORD_LENGTH = 12;
        int MIN_PASSWORD_LENGTH = 8;

        if (password.length() > MAX_PASSWORD_LENGTH || password.length() < MIN_PASSWORD_LENGTH) {
            System.out.println();
            System.out.println("Password length should be between " + MIN_PASSWORD_LENGTH + " and " + MAX_PASSWORD_LENGTH + " characters.");
            System.out.println();
        } else if (!password.matches(".*[a-z].*")) {
            System.out.println();
            System.out.println("Password should contain at least one lowercase letter.");
            System.out.println();
        } else if (!password.matches(".*[A-Z].*")) {
            System.out.println();
            System.out.println("Password should contain at least one uppercase letter.");
            System.out.println();
        } else if (!password.matches(".*\\d.*")) {
            System.out.println();
            System.out.println("Password should contain at least one digit.");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Password is valid.");
        }
    }
}
