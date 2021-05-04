package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Поиск данных внутри файла
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        ArrayList<String> productList = new ArrayList<>();
        BufferedReader readFromFile = new BufferedReader(new FileReader(fileName));
        while (readFromFile.ready()) {
            productList.add(readFromFile.readLine());
        }
        readFromFile.close();

        for (String line: productList) {
            if (line.startsWith(args[0] + " ")) {
                System.out.println(line);
            }
        }

    }
}
