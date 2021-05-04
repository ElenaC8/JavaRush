package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader readFromFile1 = new BufferedReader(new FileReader(file1));
        BufferedWriter writeToFile2 = new BufferedWriter(new FileWriter(file2));
        String line = null;

        while (readFromFile1.ready()) {
            line = readFromFile1.readLine();
            System.out.println(line);
            writeToFile2.write(line.replaceAll("\\.","!"));
        }
        readFromFile1.close();
        writeToFile2.close();
    }
}
