package com.aakash.basics.exercies;
/*
Employee Payroll System
Concept: Simulate a simple payroll system for employees.

Features:

Store employee names and salaries in separate arrays.
Calculate total payroll and average salary using loops.
Display employee details and payroll information.

Skills Practiced:

Arrays for storing data.
Loops for calculations.
Input/Output for user interaction.

*/
public class EmployeePayRollSystem {
    public static void main(String[] args) {
        String[] employees = {"Alice", "Bob", "Charlie"};
        double[] salaries = {50000.0, 60000.0, 55000.0};

        double totalPayroll = 0.0;
        for (double salary : salaries) {
            totalPayroll += salary;
        }

        double averageSalary = totalPayroll / employees.length;

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee: " + employees[i]);
            System.out.println("Salary: $" + salaries[i]);
            System.out.println();
        }
        System.out.println();
        System.out.println("Average Salary: $" + averageSalary);
        System.out.println("Total Payroll: $" + totalPayroll);
    }
}
