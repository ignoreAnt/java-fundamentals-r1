package com.aakash.classes.practice;

import java.util.random.RandomGenerator;

public class Employee {

    private static int empId = -1;
    private String name;

    private  int age;

    static {
        // 1st execution
        RandomGenerator generator = RandomGenerator.getDefault();
    }

    static {
        // 2nd execution

        RandomGenerator generator = RandomGenerator.getDefault();
    }

    // Initializer block
    {
        empId = 0;
        empId++;
        System.out.println("Inside Initialization block : " + empId);
    }


    public Employee(){
        this("Unknown", 0);
        empId++;
        System.out.println("Inside Constructor block : " + empId);
    }

    public Employee(String name){
        this(name, 0);
    }
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getEmpId() {
        return empId;
    }

    public void work(){
        System.out.println(this.name + " is working");
    }
}
