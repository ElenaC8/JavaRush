package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        TreeMap<String, Double> mapList = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            String line = reader.readLine();
            String[] array = line.split(" ");
            String key = array[0];
            Double value = Double.parseDouble(array[1]);

            if (mapList.containsKey(key)) {
                mapList.put(key, (mapList.get(key)+value));
            }
            else {
                mapList.put(key, value);
            }


        }
        reader.close();

        for (Map.Entry<String, Double> element: mapList.entrySet()) {
            String surName = element.getKey();
            Double sum = element.getValue();
            System.out.println(surName + " " + sum);
        }

    }
}
