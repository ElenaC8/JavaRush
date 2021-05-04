package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream old = System.out;

        ByteArrayOutputStream b = new ByteArrayOutputStream();
        PrintStream n = new PrintStream(b);
        System.setOut(n);
        testString.printSomething();
        System.setOut(old);

        String[] strings = b.toString().split("\\n");
        for (int i = 0; i < strings.length; ) {
            System.out.println(strings[i]);
            i++;
            if (i % 2 == 0) {
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
