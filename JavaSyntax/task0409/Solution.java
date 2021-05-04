package com.javarush.task.task04.task0409;

/* 
Closest to 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        int c,d;
        c=abs(10-a);
        d=abs(10-b);
        if (c>d) {
            System.out.println(b);
        }
        else if (c<d) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}