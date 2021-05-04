package com.javarush.task.task09.task0920;

/* 
 countdown from 10 to 0 with Thread.sleep(100);
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
            
        }
    }
}
