package com.aakash.classes.practice;


public class EmployeeTest {


    public static void main(String[] args) {
        Employee employee = new Employee("John", 23);
        Employee employee2 = new Employee("Sita", 23);
        Employee employee3 = new Employee("Geeta", 23);

        Math.abs(-4);
        System.out.println(Constants.MALE_SALUTATION + " " + employee.getName());

        employee.setName("Jonny");

        employee.work();
        employee2.work();

        System.out.println(employee.getName());

        System.out.println(Employee.getEmpId());

        Employee employee4 = new Employee();
        Employee employee5 = new Employee();


    }


}
