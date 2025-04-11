package com.aakash.abstraction.instruction;

import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<Swimable> swimables = List.of(new Shark("Shark"), new Whale("Whale"));

        for (Swimable swimable : swimables) {
            swimable.swim();
        }
    }
}
