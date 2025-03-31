package com.aakash.challenges;

public class VowelCounter {
    public static void main(String[] args) {

        String s =  "HElloai";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if  (s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e' || s.toLowerCase().charAt(i) == 'i'||
                    s.toLowerCase().charAt(i) == 'o'|| s.toLowerCase().charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("count: "  + count);
    }
}
