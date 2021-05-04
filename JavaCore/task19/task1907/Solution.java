package com.javarush.task.task19.task1907;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        Pattern pattern = Pattern.compile("\\bworld\\b");

        BufferedReader readFile = new BufferedReader(new FileReader(fileName));
        String line;
        int count = 0;
        while (readFile.ready()) {
            line = readFile.readLine();
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                count++;
            }
        }
        readFile.close();
        System.out.println(count);


    }
}
