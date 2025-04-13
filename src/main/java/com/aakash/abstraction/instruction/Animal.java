package com.aakash.abstraction.instruction;

public abstract class Animal {

    protected String name;

    private int age;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void makeSound();

    public abstract void eat();

    public void sleeping(){
        System.out.println("Sleeping");
    }
}
