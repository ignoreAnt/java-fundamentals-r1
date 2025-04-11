package com.aakash.basics.exercies;

import java.util.Scanner;

/*
Palindrome Checker
Concept: Write a program that checks if a given string is a palindrome (reads the same backward as forward).

Features:

Reverse the string using loops or StringBuilder.
Compare the original string with the reversed string using equals.
Extend the program to ignore spaces, punctuation, and case differences.

Skills Practiced:

String manipulation (charAt, substring, equals).
Loops for reversing strings.
Conditional logic for validation.
*/
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversed = sb.toString();

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        input.close();
    }
}
