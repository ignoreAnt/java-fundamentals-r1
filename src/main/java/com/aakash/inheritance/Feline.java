package com.aakash.inheritance;

public class Feline {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Feline(String name, int age) {

        this.name = name;

        this.age = age;

    }

    public void eat() {

        System.out.println(name + " is eating.");

    }

    public void sleep() {

        System.out.println(name + " is sleeping.");

    }

    public void makeSound() {

        System.out.println("Generic feline sound.");

    }

}

