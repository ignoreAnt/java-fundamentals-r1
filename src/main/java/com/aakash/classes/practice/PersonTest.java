package com.aakash.classes.practice;

public class PersonTest {
    public static void main(String[] args) {
        int[] scores = {90, 85, 88};

        Person original = new Person("Alice", scores);

        // Shallow copy

        Person shallowCopy = new Person(original.getName(), original.getScores());

        // Modify the scores array in the shallow copy

        shallowCopy.getScores()[0] = 100;

        // Both original and shallowCopy reflect the change

        System.out.println(original);
        System.out.println(shallowCopy);

        Student student = new Student();
        student.calculateMarks();

    }
}
