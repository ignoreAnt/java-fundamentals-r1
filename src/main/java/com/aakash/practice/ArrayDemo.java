package com.aakash.practice;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String s = "Hello";

        ArrayDemo arrayDemo = new ArrayDemo();
        System.out.println(arrayDemo.getCharFromString(s));

        int[] smallPrimes = new int[]{17, 19, 23, 29, 31, 37};
        int[] luckyPrimes = smallPrimes;

        luckyPrimes[2] = 7;
//        System.out.println(Arrays.toString(smallPrimes));
//        System.out.println(Arrays.toString(luckyPrimes));
//
//        Arrays.sort(smallPrimes);
//
//        System.out.println(Arrays.toString(smallPrimes));

        int[][] ragged = {
                {1},
                {2, 3},
                {4},
                {5, 6, 7}
        };

        System.out.println(Arrays.deepToString(ragged));


        Dog[] pets = new Dog[4];
        pets[0] = new Dog();
        System.out.println(pets[0].getSize());
        boolean isValid = false;
        System.out.println(isValid);
    }

    private char[] getCharFromString(String s){
        if (s.isEmpty()){
            return new char[0];
        }
        return s.toCharArray();
    }
}
