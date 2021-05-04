package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) break;
            ReadThread readThread = new ReadThread(fileName);
            readThread.run();
        }


    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            int[] byteArray = new int[256];
            try {
                FileInputStream readBytesFromFile = new FileInputStream(fileName);
                while(readBytesFromFile.available() > 0) {
                    byteArray[readBytesFromFile.read()]++;
                }
                readBytesFromFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int[] sorted = Arrays.copyOf(byteArray, byteArray.length);
            Arrays.sort(sorted);
            for (int i = 0; i<byteArray.length; i++) {
                if (sorted[byteArray.length-1] == byteArray[i]){
                    resultMap.put(fileName, i);
                }
            }



        }
    }
}
