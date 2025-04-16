package com.aakash.challenges;

import java.util.Scanner;

public class PwdChecker {

    public static boolean isValid(String pwd) throws Exception {
        if (pwd.length() < 8) {
            throw new PasswordTooShortException("Password too short. Min 8 characters required.");
        }
        if (!pwd.contains("@") && !pwd.contains("#") &&
                !pwd.contains("$")  && !pwd.contains("%") &&
                !pwd.contains("^") && !pwd.contains("&") &&
                !pwd.contains("*") && !pwd.contains("-") && !pwd.contains("_")
        ) {
            throw new InvalidCharacterException("Invalid password. Need any special character '@,#,$,*,-,&,_,%,^'.");
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;

        for (char c : pwd.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }

        if (!hasUpper) {
            throw new MissingUpperCaseException("Password should have at least 1 upper case letter.");
        }
        if (!hasLower) {
            throw new MissingLowerCaseException("Password should have at least 1 lowercase letter.");
        }
        if (!hasNumber) {
            throw new MissingNumberException("Password should have at least 1 number.");
        }

        return true;
    }

    public static void main(String[] args) {
        boolean validPwd = false;
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (count < 5) {
            try {
                System.out.println("Enter your password: ");
                String pwd = sc.nextLine();
                validPwd = isValid(pwd);
                if (validPwd) {
                    System.out.println("Password valid");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            if (count == 4) {
                System.out.println("Maximum tries reached. Exiting.");
            } else {
                System.out.println("Password invalid. Please try again.");
            }
            count++;
        }
        sc.close();
    }
}
