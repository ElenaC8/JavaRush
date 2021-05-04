package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    public static Hippodrome game;

    public static void main(String[] args) {

        List<Horse> horses = new ArrayList<>();
        Horse horse1 = new Horse("name1", 3.0, 0.0);
        Horse horse2 = new Horse("name2", 3.0, 0.0);
        Horse horse3 = new Horse("name3", 3.0, 0.0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);

        game = new Hippodrome(horses);

        game.run();
        game.printWinner();

    }

    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {

        return horses;

    }

    public void run() {

        for (int i = 1; i<=100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void move() {

        for (int i = 0; i<horses.size(); i++) {
            horses.get(i).move();
        }

    }

    public void print() {

        for (int i = 0; i<horses.size(); i++) {
            horses.get(i).print();
        }

        for (int i = 0; i<10; i++) {
            System.out.println();
        }
        
    }

    public Horse getWinner() {
        double dis = 0.0;
        Horse winner = null;
        for (int i = 0; i<horses.size(); i++) {
            if (dis < horses.get(i).distance) {
                dis = horses.get(i).distance;
                winner = horses.get(i);
            }
        }
        return winner;
    }

    public void printWinner() {

        System.out.println("Winner is " + getWinner().name + "!");

    }

}
