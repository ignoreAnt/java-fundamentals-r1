package com.aakash.sessions_practice.interfaceandlambda;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableComparatorExample {
    public static void main(String[] args) {

        Employee[] emp = new Employee[3];
        emp[0] = new Employee("mark1", 40000);
        emp[1] = new Employee("matt432", 35000);
        emp[2] = new Employee("mann", 37500);

        Arrays.sort(emp);
        System.out.println(Arrays.toString(emp));


//        Arrays.sort(emp, (first, second) -> Integer.compare(first.name));

        Arrays.sort(emp, Comparator.comparingInt(employee -> employee.getName().length()));
        System.out.println(Arrays.toString(emp));
    }
}
