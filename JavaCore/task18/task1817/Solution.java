package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];

        FileInputStream inputStream = new FileInputStream(fileName);
        int countAllSymbols = 0;
        int countSpace = 0;

        while (inputStream.available() > 0) {
            int i = inputStream.read();
            countAllSymbols++;
            if (i == 32) {
                countSpace++;
            }
        }
        inputStream.close();

        double result = (double)countSpace/countAllSymbols * 100;

        MathContext contex = new MathContext(4, RoundingMode.HALF_UP);
        BigDecimal result1 = new BigDecimal(result, contex);

        System.out.println(result1);



    }
}
