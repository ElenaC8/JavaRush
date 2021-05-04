package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName1);
        ArrayList<Integer> listString = new ArrayList<>();

        while (fileReader.ready()) {
            listString.add(fileReader.read());
        }
        fileReader.close();
        FileWriter writeToFile = new FileWriter(fileName2);
        for (int i = 1; i<listString.size();) {
            writeToFile.write(listString.get(i));
            i+=2;
        }
        writeToFile.close();



    }
}
