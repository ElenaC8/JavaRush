package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        Pattern pattern = Pattern.compile("\\b\\d*\\d\\b");

        BufferedReader readFile1 = new BufferedReader(new FileReader(file1));
        BufferedWriter writeToFile2 = new BufferedWriter(new FileWriter(file2));
        String line = null;
        while (readFile1.ready()) {
            line = readFile1.readLine();
            //System.out.println(line);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                writeToFile2.write(line.substring(matcher.start(), matcher.end()) + " ");
            }

        }
        readFile1.close();
        writeToFile2.close();


    }
}

