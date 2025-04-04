package com.aakash.abstraction.instruction;

public class Shark extends Animal implements Swimable {
    public Shark(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("shark sound");
    }

    @Override
    public void swim() {
        System.out.println("shark is swimming");
    }
}
