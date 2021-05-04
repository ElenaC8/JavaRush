package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1, file2, file3;

        try {
            file1 = reader.readLine();
            file2 = reader.readLine();
            file3 = reader.readLine();

            FileInputStream inputStream = new FileInputStream(file1);
            FileOutputStream outputStreamFile2 = new FileOutputStream(file2);
            FileOutputStream outputStreamFile3 = new FileOutputStream(file3);

            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);

            if (count %2 == 0) {
                outputStreamFile2.write(buffer, 0, count/2);
                outputStreamFile3.write(buffer, count/2, count/2);
            }
            else {
                outputStreamFile2.write(buffer, 0, (count/2+1));
                outputStreamFile3.write(buffer, (count/2+1), count/2);
            }
            inputStream.close();
            outputStreamFile2.close();
            outputStreamFile3.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
