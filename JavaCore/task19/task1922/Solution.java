package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader readFile = new BufferedReader(new FileReader(fileName));
        while (readFile.ready()) {
            String line = readFile.readLine();
            String[] buff = line.split(" ");
            int count = 0;

            for (int i = 0; i < words.size(); i++) {
                for (int y = 0; y < buff.length; y++) {
                    if (words.get(i).equals(buff[y])) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                System.out.println(line);
            }

        }
        readFile.close();


    }
}
