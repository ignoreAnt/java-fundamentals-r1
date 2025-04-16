package com.aakash.sessions_practice;

public class Animal {
    protected String picture;

    protected String food;

    protected int hunger;

    protected int[] boundaries;

    protected int[] location;

    public Animal(String picture, String food, int hunger, int[] boundaries, int[] location) {

        this.picture = picture;

        this.food = food;

        this.hunger = hunger;

        this.boundaries = boundaries;

        this.location = location;

    }

    public void makeNoise() {

        System.out.println("Generic animal noise.");

    }

    public void eat() {

        System.out.println("Eating generic food.");

    }

    public void sleep() {

        System.out.println("Sleeping...");

    }

    public void roam() {

        System.out.println("Roaming around...");

    }
}

