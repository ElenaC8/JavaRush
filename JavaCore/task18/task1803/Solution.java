package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        ArrayList<Integer> readedFromFile = new ArrayList<>();

        while (inputStream.available() > 0) {
            readedFromFile.add(inputStream.read());
        }
        inputStream.close();

        int max = 0;

        for (int i = 0; i<readedFromFile.size(); i++) {
            int count = Collections.frequency(readedFromFile, readedFromFile.get(i));

            if (count > max) {
                max = count;
            }
        }

        HashSet<Integer> setByte = new HashSet<>();

        for (int i = 0; i<readedFromFile.size(); i++) {
            if (Collections.frequency(readedFromFile, readedFromFile.get(i)) == max) {
               setByte.add(readedFromFile.get(i));
            }
        }
        for (Integer i : setByte) {
            System.out.print(i +" ");
        }
    }
}
