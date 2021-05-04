package com.javarush.task.task21.task2113;

public class Horse {

    String name;
    double speed;
    double distance;


    public Horse(String name, double speed, double didtance) {

        this.name = name;
        this.speed = speed;
        this.distance = didtance;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setSpeed(double speed) {

        this.speed = speed;

    }

    public double getSpeed() {

        return speed;

    }

    public void setDistance(double distance) {

        this.distance = distance;

    }

    public double getDistance() {

        return distance;

    }

    public void move() {

        distance += speed*Math.random();

    }

    public void print() {

        int dis = (int) Math.floor(distance);
        for(int i = 0; i<dis; i++) {
            System.out.print(".");
        }
        System.out.print(name);
        System.out.println();

    }




}
