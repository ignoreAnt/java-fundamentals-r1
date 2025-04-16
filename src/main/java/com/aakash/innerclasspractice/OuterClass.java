package com.aakash.innerclasspractice;

public class OuterClass {
    private int variable = 42;

            public class InnerClass{
                void display() {
                    System.out.println(variable);
                }
            }
}
