package com.javarush.task.task16.task1632;

public class Thread3 extends Thread {

    public void run() {
        while (true) {
            try {
                System.out.println("Ура");
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
