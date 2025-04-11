package com.aakash.basics.exercies;

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


}
