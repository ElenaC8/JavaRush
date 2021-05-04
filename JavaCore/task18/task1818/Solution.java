package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileOutputStream outputStream = new FileOutputStream(fileName1, true);
        FileInputStream inputStreamFile2 = new FileInputStream(fileName2);
        FileInputStream inputStreamFile3 = new FileInputStream(fileName3);

        while (inputStreamFile2.available() > 0) {
            outputStream.write(inputStreamFile2.read());
        }
        inputStreamFile2.close();
        while (inputStreamFile3.available() > 0) {
            outputStream.write(inputStreamFile3.read());
        }
        inputStreamFile3.close();
        outputStream.close();


    }
}
