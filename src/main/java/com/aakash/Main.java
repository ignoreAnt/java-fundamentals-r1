package com.aakash;

import com.aakash.practice.Animal;
import com.aakash.practice.Hero;

import com.aakash.classes.practice.Employee;
import com.aakash.classes.practice.Student;
import com.aakash.practice.Television;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Animal animal1 = new Animal("Dog", "pet", true);
        Animal animal2 = new Animal("Cat", "pet", true);
        Animal animal3 = new Animal("Tiger", "wild animal", false);
        Animal animal4 = new Animal("Eagle", "bird", false);

        animal1.describe("buiskets");
        animal2.describe("mouse");
        animal3.describe("meat");
        animal4.describe("fish");


        Hero hero1 = new Hero("SRK", "2cr", "Jawan");
//        Hero hero2 = new Hero("SLMK", "1.75cr", "Dabang");
//        Hero hero3 = new Hero("AMK", "3cr", "PK");





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
//        student.calculateMarks();
        Employee employee = new Employee("Emp001");
        employee.work();
    }


}