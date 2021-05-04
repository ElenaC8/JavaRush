package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thread5 extends Thread {

    public void run() {
        int i = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {

                String s = reader.readLine();

                if (s.equals("N")) {
                    System.out.println(i);
                    break;
                }

                i += Integer.parseInt(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

