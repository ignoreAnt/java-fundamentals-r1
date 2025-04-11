package com.aakash.inheritance;

public class Lion extends Feline{
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion Roar");
    }
}
