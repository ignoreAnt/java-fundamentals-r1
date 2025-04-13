package com.aakash.classes.practice;


public class Student {

    private int studentId;
    private String name;
    private String course;
    private Address address;

    public Student(int studentId, String name, String course, Address address) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.address = address;
    }

    public Student() {

    }

    public int getStudentId() {
        if (this.studentId > 0) {
            return studentId;
        }else{
            System.out.println("Student Id is negative");
            return 0;
        }
    }

    int calculateMarks(){
//        this.getStudentId();
        getStudentId();
        int result = 0;
        return result;
    }

    public void doAssignment(){
        doingHomework();
        System.out.println("Will do assignment");
    }
    private void doingHomework(){
        System.out.println("Doing homework");
    }

}
