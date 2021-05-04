package com.javarush.task.task01.task0132;

/* 
Sum of digits of a three-digit number
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(897));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        return ((number/100) + (number%100/10) + (number%10)); 
    }
}