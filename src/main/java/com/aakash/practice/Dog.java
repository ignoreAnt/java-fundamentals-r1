package com.aakash.practice;

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
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}


