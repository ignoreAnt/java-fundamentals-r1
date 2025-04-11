package com.aakash.challenges;

public class AnimalInheritance {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void eat() {
        System.out.println("Animal is eating");
    }

    // Method overloading - same method name, different parameters
    void eat(String food, String animalName) {
        System.out.println( animalName + " is eating " + food);
    }
}

class Dog extends AnimalInheritance {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends AnimalInheritance {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Rabbit extends AnimalInheritance {
    @Override
    void sound() {
        System.out.println("Rabbit squeaks");
    }
}