package com.javarush.task.task03.task0303;

/* 
 money exchange
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd (14, 1.15));
        System.out.println(convertEurToUsd(18, 2.18));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur * course;
    }
}
