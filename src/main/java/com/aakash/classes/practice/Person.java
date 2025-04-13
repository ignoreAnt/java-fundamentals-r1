package com.aakash.classes.practice;

import java.util.Arrays;
import java.util.Objects;

public class Person {

    private final String salutation = "Mr.";
    private String name;

    private int[] scores;

    private Address address;

    public Person(String name, int[] scores) {
        this.name = Objects.requireNonNullElse(name, "Unkown");
//        this.name = name;
        this.scores = scores;
    }

    public Person(){
        this("A Person", new int[0]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        var s = "SomeString";
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
