package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        while (reader.ready()) {
            String line = reader.readLine();
            String[] words = line.split(" ");

            Pattern pattern = Pattern.compile("[0-9]");

            for (int i = 0; i < words.length; i++) {
                Matcher matcher = pattern.matcher(words[i]);
                if (matcher.find()) {
                    writer.write(words[i] + " ");
                }
            }
        }
        reader.close();
        writer.close();
    }
}
