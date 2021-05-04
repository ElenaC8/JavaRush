package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        int[] byteCount = new int[256];

        while (inputStream.available() > 0) {
            int i = inputStream.read();
            byteCount[i] +=1;
        }
        inputStream.close();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i<byteCount.length; i++) {
            if (byteCount[i] !=0 && min > byteCount[i]) {
                min = byteCount[i];
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i =0; i< byteCount.length; i++) {
            if (min == byteCount[i]) {
                resultList.add(i);
            }
        }

        for (Integer i : resultList) {
            System.out.print(i + " ");
        }

    }
}
