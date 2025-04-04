package com.aakash.abstraction.instruction;

public class Cat extends Animal implements Walkable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void walk(){
        System.out.println("Cat is walking");
    }
}
