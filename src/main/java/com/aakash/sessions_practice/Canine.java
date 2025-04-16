package com.aakash.sessions_practice;

public class Canine extends Animal {

    public Canine(String picture, String food, int hunger, int[] boundaries, int[] location) {

        super(picture, food, hunger, boundaries, location);

    }

    @Override

    public void roam() {

        System.out.println("Roaming in a pack...");

    }
}
