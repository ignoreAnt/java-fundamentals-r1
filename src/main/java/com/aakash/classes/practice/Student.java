package com.aakash.classes.practice;


public class Student {

    private int studentId;
    private String name;
    private String course;

    public int getStudentId() {
        if (this.studentId > 0) {
            return studentId;
        }else{
            System.out.println("Student Id is negative");
            return 0;
        }
    }

    public int calculateMarks(){
//        this.getStudentId();
        getStudentId();
        int result = 0;
        return result;
    }


}
