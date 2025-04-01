package com.aakash.practice;

public class PassByValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + "," +  b);

        Dog dog1 = new Dog();
//        dog1.name = "figo";
        dog1.setName("figo");
        dog1.setSize(20);
        System.out.println(dog1);
        updateWeight(dog1, 50);
        System.out.println(dog1);

        /*
          [dog]  <---- dog1 // main method
            |---------> dog // inside updateWeight method
         */
    }

    private static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside: " +  a + "," +  b);
    }

    private static Dog updateWeight(Dog dog, int size){
        dog.setSize(size);

        return dog;
    }
}
