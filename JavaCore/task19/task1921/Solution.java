package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        String fileName = args[0];

                

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            String[] buff = reader.readLine().split(" ");

            int year = Integer.parseInt(buff[buff.length-1]);
            int month = Integer.parseInt(buff[buff.length-2]);
            int day = Integer.parseInt(buff[buff.length-3]);

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i<buff.length-3; i++) {
                sb.append(buff[i]).append(" ");
            }
            String name = sb.toString().trim();

            PEOPLE.add(new Person(name, new Date(year-1900, month-1, day)));
        }
        reader.close();


    }
}
