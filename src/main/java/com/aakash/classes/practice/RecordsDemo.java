package com.aakash.classes.practice;

public class RecordsDemo {
    private record Point(double x, double y) {}

    public static void main(String[] args) {
        var p = new Point(3, 5);
        System.out.println(p.x());
        System.out.println(p.y());
        System.out.println(p);
    }
}