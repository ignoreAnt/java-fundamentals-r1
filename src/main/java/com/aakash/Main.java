package com.aakash;

import com.aakash.practice.Animal;
import com.aakash.practice.Hero;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Animal animal1 = new Animal("Dog", "pet", true);
        Animal animal2 = new Animal("Cat", "pet", true);
        Animal animal3 = new Animal("Tiger", "wild animal", false);
        Animal animal4 = new Animal("Eagle", "bird", false);

        animal1.describe("buiskets");
        animal2.describe("mouse");
        animal3.describe("meat");
        animal4.describe("fish");


        Hero hero1 = new Hero("SRK", "2cr", "Jawan");
//        Hero hero2 = new Hero("SLMK", "1.75cr", "Dabang");
//        Hero hero3 = new Hero("AMK", "3cr", "PK");





    }
}