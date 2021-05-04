package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    public static CanFly result;
    static {
        //add your code here - добавьте код тут
        reset();
        System.out.println(result);
    }



    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            if (s.equals("helicopter")) {
                result = new Helicopter();
            }
            if (s.equals("plane")) {
                int pass = Integer.parseInt(reader.readLine());
                result = new Plane(pass);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
