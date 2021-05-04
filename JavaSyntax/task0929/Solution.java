package com.javarush.task.task09.task0929;

/* 
working with file
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();

        try {
            InputStream fileInputStream = getInputStream(sourceFileName);
        }
        catch (Exception e) {
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
        }
        InputStream fileInputStream = getInputStream(sourceFileName);



        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);


        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

