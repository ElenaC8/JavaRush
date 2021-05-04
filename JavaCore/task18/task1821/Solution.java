package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputFile = new FileInputStream(args[0]);
        int[] array = new int[256];
        while (inputFile.available() > 0) {
            int i = inputFile.read();
            array[i]++;
        }
        inputFile.close();
        

        for (int i = 0; i<array.length; i++) {
            if (array[i] > 0) {
                System.out.println((char)i + " " + array[i]);
            }
        }



    }
}
