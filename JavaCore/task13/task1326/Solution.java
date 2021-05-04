package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        try {
            fileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Integer> dataList = new ArrayList<>();
        String line = null;
        try {
            BufferedReader readerFromFile = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            while ((line = readerFromFile.readLine()) != null) {
                dataList.add((Integer.parseInt(line)));
            }
            readerFromFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] array = new int[dataList.size()];
        for (int i = 0; i<dataList.size(); i++) {
            array[i] = dataList.get(i);
        }
        Arrays.sort(array);
        for (int i = 0; i<array.length; i++) {
            if (array[i] % 2 ==0) {
                System.out.println(array[i]);
            }
        }


    }
}
