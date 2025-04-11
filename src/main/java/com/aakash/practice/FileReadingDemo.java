package com.aakash.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.Stack;

public class FileReadingDemo {
    public static void main(String[] args) throws IOException {
        Scanner inFile = new Scanner(Path.of("myFile.txt"), StandardCharsets.UTF_8);

        String dir = System.getProperty("user.dir");

        System.out.println("Working Directory: " + dir);

        StringBuilder sb = new StringBuilder();
        while (inFile.hasNext()){
            String line = inFile.nextLine();
            sb.append(line.toUpperCase()).append(" ");
            System.out.println(line);
        }

        var s = sb.toString();
        System.out.println("MyString : " + s);

        PrintWriter printWriter = new PrintWriter("myNewFile.txt");
        printWriter.println(s);
        printWriter.close();

    }
}
