package com.aakash.practice;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name ?");
//        String name = in.nextLine();
        String name = in.next();

        System.out.println("Your name is : " + name.toUpperCase());
    }
}
