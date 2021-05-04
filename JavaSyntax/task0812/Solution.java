package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Longest sequence
*/
public class Solution {
        
        public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<10; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int counter = 1;
        int counterMax=1;

        for (int i = 1; i<list.size(); i++)
        {
            if (list.get(i).equals(list.get(i-1)))
            {
                counter++;
                if (counterMax < counter)
                {
                    counterMax = counter;
                }
            }
            else
            {
                counter = 1;
            }
        }
        System.out.println(counterMax);

    }
}