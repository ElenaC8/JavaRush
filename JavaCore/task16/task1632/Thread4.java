package com.javarush.task.task16.task1632;

public class Thread4 extends Thread implements Message {

    boolean myBoolean = true;
    @Override
    public void showWarning() {
        myBoolean = false;
    }

    public void run() {

        while (myBoolean) {

        }

    }
}
