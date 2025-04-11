package com.aakash.challenges;

import java.util.Scanner;

public class PwdChecker {
    static boolean isValid(String pwd) {
        if (pwd.length() < 8) {
            System.out.println("Password too short. Min 8 characters required" );
            return false;
        }
        if (!pwd.contains("@") && !pwd.contains("#") &&
                !pwd.contains("$")  && !pwd.contains("%") &&
                !pwd.contains("^") && !pwd.contains("&") &&
                !pwd.contains("*") && !pwd.contains("-") && !pwd.contains("_")
        ) {
            System.out.println("Invalid password. Need any special character '@,#,$,*,-,&,_,%,^'");
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;

        for (int i = 0; i < pwd.length(); i++) {
            if ((int)pwd.charAt(i) >= 65 && (int)pwd.charAt(i) <= 90) {
                hasUpper = true;
            }
            if ((int)pwd.charAt(i) >= 97 && (int)pwd.charAt(i) <= 122) {
               hasLower = true;
            }
            if ((int)pwd.charAt(i) >= 48 && (int)pwd.charAt(i) <= 57) {
                hasNumber = true;
            }
        }

        if (!hasUpper) {
            System.out.println("Password should have at least 1 upper case");
            return false;
        }
        if (!hasLower) {
            System.out.println("Password should have at least 1 lowercase");
            return false;
        }
        if (!hasNumber) {
            System.out.println("Password should have at least 1 number");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        boolean validPwd = false;
        Scanner sc = new Scanner(System.in);;
        int count = 0;
        while (count <= 5) {
            System.out.println("Enter your password: ");
            String pwd = sc.nextLine();
            validPwd = isValid(pwd);
            if (validPwd) {
                System.out.println("Password valid");
                break;
            } else {
                if (count == 5) {
                    System.out.println("Maximum tries reached. Exiting");
                } else  {
                    System.out.println("Password invalid. Please try again");
                }
                count++;
            }
        }
        sc.close();
    }
}
