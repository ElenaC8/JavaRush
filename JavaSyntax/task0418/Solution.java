package com.javarush.task.task04.task0418;

/* 
 read 2 numbers and find min
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader a1 = new BufferedReader(new InputStreamReader(System.in));
        String sa = a1.readLine();
        int a = Integer.parseInt(sa);
        BufferedReader a2 = new BufferedReader(new InputStreamReader(System.in));
        String sb = a2.readLine();
        int b = Integer.parseInt(sb);
        
        if (a>b) {
            System.out.println(b);
        }
        else if (a<b) {
            System.out.println(a);
        }
        else if (a==b) {
            System.out.println(a);
        }
        
        
    }
}