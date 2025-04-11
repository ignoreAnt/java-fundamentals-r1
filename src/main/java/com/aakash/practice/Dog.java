package com.aakash.practice;

import java.util.Objects;

class Dog {

    private int size; // Instance variable representing the dog's size

    private String name; // Instance variable representing the dog's name

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    void bark() { // Method that determines the bark based on size

        if (size > 60) {

            System.out.println("Wooof! Wooof!"); // Big dog barks loudly

        } else if (size > 14) {

            System.out.println("Ruff! Ruff!"); // Medium-sized dog barks moderately

        } else {

            System.out.println("Yip! Yip!"); // Small dog barks softly

        }

    }

    @Override
    public String toString() {
        return "Dog{" +
                "size=" + this.size +
                ", name='" + this.name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return size == dog.size && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name);
    }
}


