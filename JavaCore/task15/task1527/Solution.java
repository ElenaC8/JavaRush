package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try { s = reader.readLine(); }
        catch (IOException e) {
            e.printStackTrace();
        }

        String[] stringsMassive = s.substring(s.indexOf('?')+1).split("&");
        for (String str:stringsMassive) {
            if (str.contains("=")) {
                System.out.print(str.substring(0,str.indexOf("=")) + " ");
            }
            else {
                System.out.print(str + " ");
            }
        }
        System.out.println();

        for (String str: stringsMassive) {
            if (str.contains("obj")) {
                try { alert(Double.parseDouble(str.substring(4)));}
                catch (NumberFormatException e) {
                    alert(str.substring(4));
                }
            }

        }




    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
