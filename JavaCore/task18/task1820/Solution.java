package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader readFromFile = new BufferedReader(new FileReader(file1));
        String numbersInOneLine = readFromFile.readLine();
        readFromFile.close();

        String[] numbers = numbersInOneLine.split(" ");
        String[] result = new String[numbers.length];
        for (int i = 0; i<numbers.length; i++) {
            double tempNumber = Double.parseDouble(numbers[i]);
            int roundedNumber = (int) Math.round(tempNumber);
            result[i] = String.valueOf(roundedNumber);
        }
        String line = result[0] + " ";
        for (int i = 1; i<result.length; i++) {
            line += result[i] +" ";
        }
        //System.out.println(line);
        FileWriter writeToFile2 = new FileWriter(file2);
        writeToFile2.write(line);
        writeToFile2.close();

    }
}
