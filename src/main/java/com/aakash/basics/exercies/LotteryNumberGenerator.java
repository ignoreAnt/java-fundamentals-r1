package com.aakash.basics.exercies;

import java.util.Arrays;
import java.util.Scanner;

/*
Lottery Number Generator
Concept: Generate random lottery numbers and check if a user's input matches the winning combination.

Features:

Use Math.random() or Random class to generate random numbers.
Store the generated numbers in an array.
Compare the user's input (stored in another array) with the generated numbers.
Display whether the user has won or lost.

Skills Practiced:

Arrays for storing numbers.
Random number generation.
Loops for comparison and iteration.

 */
public class LotteryNumberGenerator {
    public static void main(String[] args) {
       int[] lotteryNumbers = new int[6];
        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(lotteryNumbers));
        int[] userNumbers = new int[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print("Enter " + userNumbers.length + " lottery number as single digit, Enter digit -> " + (i + 1) + ": ");
            userNumbers[i] = input.nextInt();
        }

        boolean match = true;
        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (lotteryNumbers[i] != userNumbers[i]) {
                match = false;
                break;
            }
        }

        if (match) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
