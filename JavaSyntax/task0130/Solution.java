package com.javarush.task.task01.task0130;

/* 
 convertCelsiumToFahrenheit
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        //напишите тут ваш код
        double f;
        f = ((double) celsium * 9 / 5) + 32;

        return f;
    }
}