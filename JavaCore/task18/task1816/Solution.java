package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        FileInputStream inputStream = new FileInputStream(fileName);
        int count = 0;

        while (inputStream.available() > 0) {
            int i = inputStream.read();

            if ((i >= 65 && i<= 90) || (i >= 97 && i <=122 )) {
                count++;
            }
        }
        inputStream.close();

        System.out.println(count);

    }
}
