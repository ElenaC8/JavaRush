package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
 Array in reverse order
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] massiv = new String[10];
        BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < 8; i++) {
            massiv[i] = c.readLine();
        }
        
        for (int i = 7; i >= 0; i--) {
            System.out.println(massiv[i]);
        }
    
    }
}