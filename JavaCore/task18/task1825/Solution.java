package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> fileList = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (Integer.parseInt(o1.split(".part")[1])) - (Integer.parseInt(o2.split(".part")[1]));
            }
        });
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("end")) break;
            fileList.add(fileName);
        }
        reader.close();

        String[] substring = new String[2];
        substring = fileList.first().split(".part");
        String fileOutputName = substring[0];

        BufferedOutputStream bufferedOutput = new BufferedOutputStream(new FileOutputStream(fileOutputName));

        Iterator<String> fileName = fileList.iterator();

        while (fileName.hasNext()) {
            String fileToOutput = fileName.next();
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileToOutput));
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            bufferedOutput.write(buffer);
        }
        bufferedOutput.close();

    }
}
