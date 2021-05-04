package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(5.0, "olo");
        labels.put(3.9, "dd");
        labels.put(2.3, "dd1");
        labels.put(3.2, "rec");
        labels.put(6.9, "fd");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
