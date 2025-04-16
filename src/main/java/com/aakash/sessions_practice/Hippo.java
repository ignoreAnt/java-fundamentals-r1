package com.aakash.sessions_practice;

public class Hippo extends Animal {

    public Hippo(String picture, String food, int hunger, int[] boundaries, int[] location) {

        super(picture, food, hunger, boundaries, location);

    }

    @Override

    public void makeNoise() {

        System.out.println("Grunting...");

    }

    @Override

    public void eat() {

        System.out.println("Eating grass...");

    }

}
