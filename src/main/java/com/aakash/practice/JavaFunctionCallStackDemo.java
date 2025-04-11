package com.aakash.practice;

public class JavaFunctionCallStackDemo {
    public static void main(String[] args) {
        int x  = 10;
        int y  = 20;
        Dog dog = new Dog();
        methodOne(x, y, dog);

        Object obj = new Object();
    }

    private static void methodOne(int a, int b, Dog dog){
        int c = a + b;
        dog.setName("Figo");
        System.out.println("Inside method one : " + c + " : " + dog);
        methodTwo(a, c);
    }

    private static void methodTwo(int a, int b) {
        int d = a * b;
        System.out.println("Inside method two : " +  d);
        methodThree(d, b);
    }

    private static void methodThree(int a, int b) {
        int e = a - b;
        System.out.println("Inside method three : " +  e);
    }
}
