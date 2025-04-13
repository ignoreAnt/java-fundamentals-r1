package com.aakash.basics.exercies;

import java.util.Objects;

public class Student {
    private int studentId;
    private String name;
    private String course;

    public int getStudentId() {
        if (this.studentId > 0) {
            return studentId;
        }else{
            Object obj = new Object();
            System.out.println("Student Id is negative");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, course);
    }

}
