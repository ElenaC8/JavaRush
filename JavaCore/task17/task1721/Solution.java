package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = null;
        String file2 = null;
        try {
            file1 = reader.readLine();
            file2 = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader readFile1 = null;
        BufferedReader readFile2 = null;
        try {
            readFile1 = new BufferedReader(new FileReader(file1));
            while (readFile1.ready()) {
                allLines.add(readFile1.readLine());
            }
            readFile1.close();

            readFile2 = new BufferedReader(new FileReader(file2));
            while (readFile2.ready()) {
                forRemoveLines.add(readFile2.readLine());
            }
            readFile2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        }

        else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
