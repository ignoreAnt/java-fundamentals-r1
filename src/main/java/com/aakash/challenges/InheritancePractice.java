package com.aakash.challenges;

public class InheritancePractice {
    public static void main(String[] args) {
        AnimalInheritance dog = new Dog();
        AnimalInheritance cat = new Cat();
        AnimalInheritance rabbit = new Rabbit();

        dog.sound();
        cat.sound();
        rabbit.sound();

        dog.eat();
        cat.eat();
        rabbit.eat();

        dog.eat("Chicken", "Dog");
        cat.eat("Mouse", "Cat");
        rabbit.eat("Carrot",  "Rabbit");
    }
}
