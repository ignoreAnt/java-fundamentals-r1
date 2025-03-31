package com.aakash.practice;

public class Animal {
    private String name;
    private String kind;
    private boolean isPetFriendly;
    public Animal(String name, String kind, boolean isPetFriendly) {
        this.name = name;
        this.kind = kind;
        this.isPetFriendly = isPetFriendly;
    }

    public void describe(String food) {
        System.out.println(this.name + " is of kind " + this.kind + " eats " + food + " and " +  "is Pet Friendly: " +
                this.isPetFriendly);
    }

}
