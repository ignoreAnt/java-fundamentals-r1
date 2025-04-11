package com.aakash.classes.practice;

import java.text.NumberFormat;

public class FactoryMethod {
    public static void main(String[] args) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        currencyFormatter.format(2.3456);
        System.out.println(currencyFormatter);
    }
}
