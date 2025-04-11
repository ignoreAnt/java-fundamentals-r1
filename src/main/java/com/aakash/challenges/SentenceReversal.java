package com.aakash.challenges;

import java.util.Arrays;

public class SentenceReversal {
    public static void main(String[] args) {
        String s =  "Hello how are you";
        String[] words = s.split(" ");
//        words
        StringBuilder sb = new StringBuilder();
        String str = "";
        String[] res = new String[words.length];
        for (int i = words.length -1; i >= 0 ; i--) {
            //str += String.join(" ", words[i]);
            sb.append(words[i]).append(" ");
//            str += words[i] + " ";
        }
//        System.out.println(Arrays.toString(res));
        System.out.println(sb.toString());
    }
}
