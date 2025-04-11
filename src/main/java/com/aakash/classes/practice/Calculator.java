package com.aakash.classes.practice;

public class Calculator {

    private int firstOperand;
    private int secondOperand;

    private String operator;

    private Employee object;

    public Calculator() {
    }

    public Calculator(int firstOperand) {
        System.out.println("Calling constructor with int parameter");
        this.firstOperand = firstOperand;
    }

    public Calculator(String operator) {
        System.out.println("Calling constructor with String parameter");
        this.operator = operator;
    }

    public Calculator(Employee operator) {
        System.out.println("Calling constructor with Employee parameter");
        this.object = operator;
    }

    public Calculator(int firstOperand, int secondOperand, String operator) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
    }

    public int getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int add(int a, int b, String operator){
        int result = 0;
        if (operator.equalsIgnoreCase("+")){
             result = a + b;
        }

        return result;
    }

    public double add(double a, double b, String operator){
        double result = 0;
        if (operator.equalsIgnoreCase("+")){
            result = a + b;
        }

        return result;
    }

    public int add(int a, int b, int c, String operator){
        int result;
        if (operator.equalsIgnoreCase("+")){
            result = a + b + c;
        }else {
            result = -1;
        }

        return result;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
