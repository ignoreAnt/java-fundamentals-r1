package com.aakash;

import com.aakash.classes.practice.Employee;
import com.aakash.classes.practice.Student;
import com.aakash.practice.Television;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String[] brands = {"Samsung", "Sony", "TLC"};

        List<Television> televisions = new ArrayList<>();
        for (String brand:brands) {
            televisions.add(new Television(brand));
        }

        System.out.println(televisions);
        Television television = new Television("Samsung");
//        Television television1 = new Television("Sony");
//        Television television2 = new Television("TLC");

        long longNumber = 4_00_0000_000L;
        float pi = 3.14F;
        double pi1 = 3.1415;
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);

        System.out.println(2.0 - 1.1);

        television.setCurrentChannel(23);
        System.out.println(television.getBrand());

        System.out.println(television.getCurrentChannel());
        television.setCurrentChannel(45);
        System.out.println(television.getVolume());
        System.out.println(television.getCurrentChannel());

        char copyright = '\u00A9'; // 000A is interpreted as a newline during parsing
        System.out.println(copyright);

//        System.out.println(television1.getBrand());
//        System.out.println(television2.getBrand());

        Student student = new Student();
        Employee employee = new Employee("Emp001");
        employee.work();
    }


}