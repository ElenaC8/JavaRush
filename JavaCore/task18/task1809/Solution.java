package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        byte[] buffer = new byte[inputStream.available()];
        int countBuffer = inputStream.read(buffer);

        for (int i = countBuffer-1; i>=0; i--) {
            outputStream.write(buffer[i]);
        }

        inputStream.close();
        outputStream.close();

    }
}
