package com.aakash.inheritance;

public class Tiger extends Feline {

    public Tiger(String name, int age) {

        super(name, age);

    }

    @Override
    public void makeSound() {

        System.out.println("Roar!");

    }

}
