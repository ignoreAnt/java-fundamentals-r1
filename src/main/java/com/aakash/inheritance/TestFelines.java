package com.aakash.inheritance;

public class TestFelines {
    public static void main(String[] args) {

        Feline cat = new HouseCat("Whiskers", 3);
        Feline tiger = new Tiger("Shere Khan", 5);
        Feline lion = new Lion("Mufasa", 7);

        cat.makeSound();  // Output: Meow!

        tiger.makeSound(); // Output: Roar!

        lion.makeSound();

    }
}
