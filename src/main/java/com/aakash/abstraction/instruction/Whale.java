package com.aakash.abstraction.instruction;

public class Whale extends Animal implements Swimable {
    public Whale(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Whale sound");
    }


    @Override
    public void swim() {
        System.out.println("Whale is swimming");
    }
}
