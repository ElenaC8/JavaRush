package com.javarush.task.task02.task0201;

/*
 implement the print method
*/
public class Solution {
    public static void main(String[] args) {
        print("Java easy to learn!");
        print("Java opens many opportunities!");
    }

    public static void print(String s) {
        //write your code here
        for (int i = 0; i < 4; i++) {
        System.out.println(s);
        }
        
    }
}
