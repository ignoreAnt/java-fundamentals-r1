package com.aakash.basics.exercies;

import java.util.Scanner;

/*
Grade Calculator
Concept: Calculate the average grade of students based on their scores.

Features:

Accept multiple grades as input and store them in an array.
Compute the average using a loop.
Assign a letter grade (A, B, C, etc.) based on the average using conditionals.

Skills Practiced:

Arrays for storing grades.
Loops for summing and averaging.
Conditional statements for grading.

 */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[] scores = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        int total = 0;
        for (int score : scores) {
            total += score;
        }

        double average = (double) total / numStudents;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Average: " + average);
        System.out.println("Letter grade: " + grade);

        input.close();
    }
}
