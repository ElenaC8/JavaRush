package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
        PrintStream newOut = new PrintStream(byteOutput);
        System.setOut(newOut);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        testString.printSomething();
        System.setOut(out);

        FileOutputStream outputStream = new FileOutputStream(fileName);
        byte[] buffer = byteOutput.toString().getBytes();
        outputStream.write(buffer);
        outputStream.close();
        System.out.println(byteOutput.toString());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

