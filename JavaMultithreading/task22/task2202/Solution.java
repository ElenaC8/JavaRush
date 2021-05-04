package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {

        if (string == null) {
            throw new TooShortStringException();
        }

        String[] words = string.split(" ");
        String result = "";
        StringBuilder buildResult = new StringBuilder(result);

        if (words.length < 5) {
            throw new TooShortStringException();
        }

        for (int i = 1; i<5; i++) {
            buildResult.append(words[i]);
            buildResult.append(" ");
        }

        result = buildResult.toString().trim();

        return result;
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
