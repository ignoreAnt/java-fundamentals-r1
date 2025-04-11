package com.aakash.inheritance;

public class HouseCat extends Feline {

    public HouseCat(String name, int age) {

        super(name, age);

    }

    @Override
    public void makeSound() {

        System.out.println( getName() +  " Meow!");

    }

}
