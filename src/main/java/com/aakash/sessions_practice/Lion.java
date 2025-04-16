package com.aakash.sessions_practice;

public class Lion extends Feline {

    public Lion(String picture, String food, int hunger, int[] boundaries, int[] location) {

        super(picture, food, hunger, boundaries, location);

    }

    @Override

    public void makeNoise() {

        System.out.println("Roar!");

    }

    @Override

    public void eat() {

        System.out.println("Eating meat...");

    }

}