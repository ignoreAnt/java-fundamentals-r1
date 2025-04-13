package com.aakash.abstraction.instruction;

public class Cat extends Animal implements Pettable, Walkable{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow " + this.name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void pet() {
        System.out.println("Petting cat");
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }


}
