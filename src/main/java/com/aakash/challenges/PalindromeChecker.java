package com.aakash.challenges;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int checkLimit = 5;
        while (checkLimit > 0) {
            System.out.println("Please enter a string: ");
            String ip = input.nextLine().toLowerCase();

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < ip.length(); i++) {
                if (Character.isLetterOrDigit(ip.charAt(i))) {
                    builder.append(ip.charAt(i));
                }
            }

            int chLeft  = 0;
            int chRight  = builder.length() - 1;
            boolean invalid = false;
            while (chLeft <= chRight) {
                if(builder.charAt(chLeft) != builder.charAt(chRight)) {
                    invalid = true;
                    break;
                }
                chLeft++;
                chRight--;
            }
            if(invalid){
                System.out.println(ip + " is not palindrome");
            } else {
                System.out.println(ip + " is palindrome");
            }
            checkLimit--;
        }
        input.close();
    }
}
