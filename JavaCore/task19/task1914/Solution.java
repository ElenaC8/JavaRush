package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.String.valueOf;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        PrintStream newOut = new PrintStream(byteArray);
        System.setOut(newOut);
        testString.printSomething();
        System.setOut(out);
        String result = byteArray.toString();
        String[] element = result.split(" ");
        int res = 0;
        switch (element[1]) {
            case "+": res = Integer.parseInt(element[0]) + Integer.parseInt(element[2]);
            break;
            case "-": res = Integer.parseInt(element[0]) - Integer.parseInt(element[2]);
            break;
            case "*": res = Integer.parseInt(element[0]) * Integer.parseInt(element[2]);
            break;
        }

        System.out.printf("%s %s %s %s %s", element[0],element[1], element[2], element[3], res);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

