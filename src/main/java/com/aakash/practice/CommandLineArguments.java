package com.aakash.practice;

public class CommandLineArguments {
    public static void main(String[] args) {

        // Check for arguments

        if (args.length == 0 || args[0].equals("-h")) {

            System.out.print("Hello,");

        } else if (args[0].equals("-g")) {

            System.out.print("Goodbye,");

        }

        // Print remaining arguments

        for (int i = 1; i < args.length; i++) {

            System.out.print(" " + args[i]);

        }

        System.out.println("!");

    }
}
