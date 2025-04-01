package com.aakash.challenges;

public class WordCounter {
    public static void main(String[] args) {

        String sentence = "Hello World, How are you? hope you are doing well";
        String[] words = sentence.split(" ");
        System.out.println(words.length);
        int charCount = 0;
        char[] chars = sentence.toCharArray();
        for (char aChar : chars) {
            boolean ch = Character.isLetterOrDigit(aChar);
            if (ch) {
                charCount++;
            }
        }
        System.out.println("Char count: " + charCount);
    }
}
