package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readFileName = new BufferedReader(new InputStreamReader(System.in));
        String fileName = readFileName.readLine();
        readFileName.close();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            String line = reader.readLine();
            StringBuilder sb = new StringBuilder(line);
            sb = sb.reverse();
            System.out.println(sb.toString());
        }
        reader.close();
    }
}
