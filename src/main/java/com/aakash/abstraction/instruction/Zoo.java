package com.aakash.abstraction.instruction;

import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Dog("Dog");
        Animal cat = new Cat("Cat");
        Swimable shark = new Shark("shark");
        Swimable whale = new Whale("whale");
        Animal[] animals = {dog, cat};
        Swimable[] swimables = {shark, whale};

        Object dog1 = new Dog("Dog");
        System.out.println(dog.equals(dog1));



        System.out.println(dog.getClass().getName());

        for (Animal animal : animals) {
            animal.makeSound();
            animal.sleeping();
        }

        for (Swimable an : swimables){
            an.swim();
        }
    }
}
