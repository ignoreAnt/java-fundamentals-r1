package com.aakash.basics.exercies;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getStudentId());

        Student student1 = new Student();
        System.out.println(student1.getStudentId());

        System.out.println(student.equals(student1));
    }
}
