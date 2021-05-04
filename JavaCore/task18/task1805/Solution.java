package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        HashSet<Integer> numbers = new HashSet<>();

        while (inputStream.available() > 0) {
            numbers.add(inputStream.read());
        }
        inputStream.close();

        ArrayList<Integer> numbersForSort = new ArrayList<>();
        for (Integer i : numbers) {
            numbersForSort.add(i);
        }

        Collections.sort(numbersForSort);

        for (Integer i: numbersForSort) {
            System.out.print(i + " ");
        }
    }
}
