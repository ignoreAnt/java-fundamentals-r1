package com.aakash.sessions_practice;

public class Dog extends Canine {

    public Dog(String picture, String food, int hunger, int[] boundaries, int[] location) {

        super(picture, food, hunger, boundaries, location);

    }

    @Override

    public void makeNoise() {

        System.out.println("Bark!");

    }

    @Override

    public void eat() {

        System.out.println("Eating dog food...");

    }

}

