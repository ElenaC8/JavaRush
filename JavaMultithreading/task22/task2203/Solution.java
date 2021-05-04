package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {

    public static String getPartOfString(String string) throws TooShortStringException {

        if (string == null) {
            throw new TooShortStringException();
        }

        int firstIndex = 0;
        int lastIndex = 0;

        firstIndex = string.indexOf("\t");
        lastIndex = string.indexOf("\t", firstIndex+1);
        if (lastIndex == -1) {
            throw new TooShortStringException();
        }


        return string.substring(firstIndex+1, lastIndex);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
