package com.aakash.practice;

import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Invoice:\n");

        for (int i = 0; i < 100; i++) {
            stringBuilder.append("Hello ")
                    .append(i)
                    .append("\n");
        }

        String s = stringBuilder.toString();

        System.out.println(s);

        String hello = "HelloWorld!";
        stringBuilder = new StringBuilder(hello);
        var string = stringBuilder.reverse().toString();
        System.out.println(string);

        Scanner in = new Scanner(System.in);
    }
}
