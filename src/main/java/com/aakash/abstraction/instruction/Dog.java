package com.aakash.abstraction.instruction;

public class Dog extends Animal implements Walkable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}
