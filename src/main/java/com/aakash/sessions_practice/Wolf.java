package com.aakash.sessions_practice;

public class Wolf extends Canine {

    public Wolf(String picture, String food, int hunger, int[] boundaries, int[] location) {

        super(picture, food, hunger, boundaries, location);

    }

    @Override

    public void makeNoise() {

        System.out.println("Howl!");

    }

    @Override

    public void eat() {

        System.out.println("Eating meat...");

    }

}
