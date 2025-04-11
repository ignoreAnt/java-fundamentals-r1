package com.aakash.basics.exercies;

import java.util.Scanner;

/*
Word Counter
Concept: Write a program that counts the number of words in a given sentence or paragraph.

Features:

Use split(" ") to split the input string into words.
Count the number of elements in the resulting array.
Extend the program to count characters, lines, or specific words.

Skills Practiced:

String manipulation (split, length).
Arrays for storing words.
Loops for iterating through the array.
 */
public class WordCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence or paragraph: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");
        int wordCount = words.length;

        System.out.println("You have entered ::  " + sentence + "\nwhich has " + wordCount + " words ");
        input.close();
    }
}
