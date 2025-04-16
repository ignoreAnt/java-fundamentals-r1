package com.aakash.innerclasspractice;

public class OuterClassMain {
    public static void main(String[] args) {
        OuterClass oc =  new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();
    }
}
