package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];



                //

        TreeMap<String, Double> allData = new TreeMap<>();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            String line = reader.readLine();
            String[] array = line.split(" ");
            String key = array[0];
            Double value = Double.parseDouble(array[1]);

            if (allData.containsKey(key)) {
                allData.put(key, (allData.get(key)+value));
            }
            else {
                allData.put(key, value);
            }

        }
        reader.close();

        Double max = 0.0;
        for(Map.Entry<String,Double> element: allData.entrySet()) {
            if (element.getValue() > max) {
                max = element.getValue();
            }
        }

        TreeSet<String> surnames = new TreeSet<>();
        for (Map.Entry<String, Double> element: allData.entrySet()) {
            if (element.getValue().equals(max)) {
                surnames.add(element.getKey());
            }
        }

        for (String s: surnames) {
            System.out.println(s);
        }


    }
}
