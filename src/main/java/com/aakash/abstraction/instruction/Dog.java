package com.aakash.abstraction.instruction;

public class Dog extends Animal implements Pettable, Walkable{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark " + this.name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void pet() {
        System.out.println("Petting Dog");
    }

    @Override
    public void walk() {
        System.out.println("Walking a Dog");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
