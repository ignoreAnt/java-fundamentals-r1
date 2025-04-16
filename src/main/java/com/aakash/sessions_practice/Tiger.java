package com.aakash.sessions_practice;

public class Tiger extends Feline{
    public Tiger(String picture, String food, int hunger, int[] boundaries, int[] location) {

        super(picture, food, hunger, boundaries, location);

    }

    @Override

    public void makeNoise() {

        System.out.println("Growl!");

    }

    @Override

    public void eat() {

        System.out.println("Eating meat...");

    }

}
