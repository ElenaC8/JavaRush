package com.javarush.task.task05.task0532;

import java.io.*;

/* 
read n>0, read n numbers, find max of them
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        //напишите тут ваш код
        int a;
        int n = Integer.parseInt(reader.readLine());
        int max = 1;

        for (int i = 1; i < n; i++) {
            a = Integer.parseInt(reader.readLine());
            max = Math.max(a, max);

        }
        System.out.println(max);
    }
}
