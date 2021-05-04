package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        ArrayList<String> list = new ArrayList<>();
        while (reader.ready()) {
            String line = reader.readLine();
            String[] buff = line.split(" ");

            for (int i = 0; i < buff.length; i++) {
                if (buff[i].length() > 6) {
                    list.add(buff[i] + ",");
                }
            }
        }
        reader.close();

        for (int i = 0; i < list.size(); i++) {
            String result = list.get(i);
            if (i == list.size()-1) {
                result = result.replace(",","");
            }
            writer.write(result);
        }
        writer.close();

    }
}
