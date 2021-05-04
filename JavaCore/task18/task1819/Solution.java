package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.Arrays;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream inputFile1 = new FileInputStream(file1);
        byte[] file1Bytes = new byte[inputFile1.available()];
        inputFile1.read(file1Bytes);
        inputFile1.close();

        FileInputStream inputFile2 = new FileInputStream(file2);
        FileOutputStream outputFile1 = new FileOutputStream(file1);

        while (inputFile2.available() > 0) {
            outputFile1.write(inputFile2.read());
        }
        inputFile2.close();

        outputFile1.write(file1Bytes);
        outputFile1.close();










    }
}
