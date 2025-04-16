package com.aakash.sessions_practice;

public class Cat extends Feline {

    public Cat(String picture, String food, int hunger, int[] boundaries, int[] location) {

        super(picture, food, hunger, boundaries, location);

    }

    @Override

    public void makeNoise() {

        System.out.println("Meow!");

    }

    @Override

    public void eat() {

        System.out.println("Eating cat food...");

    }

}

