package com.javarush.task.task10.task1013;

/* 
constructors for class Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int age;
        private int weight;
        private String name;
        private String surname;
        private String job;
        private boolean isPet;

        public Human (int age) {
            this.age = age;
        }

        public Human (int age, int weight) {
            this.age = age;
            this.weight = weight;
        }

        public Human (int age, int weight, String name) {
            this.age = age;
            this.weight = weight;
            this.name = name;
        }

        public Human (int age, int weight, String name, String surname) {
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.surname = surname;
        }

        public Human (int age, int weight, String name, String surname, String job) {
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.surname = surname;
            this.job = job;
        }

        public Human (int age, int weight, String name, String surname, String job, boolean isPet) {
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.surname = surname;
            this.job = job;
            this.isPet = isPet;
        }

        public Human (int weight, String name, String surname, String job, boolean isPet) {
            this.weight = weight;
            this.name = name;
            this.surname = surname;
            this.job = job;
            this.isPet = isPet;
        }

        public Human (String name, String surname, String job, boolean isPet) {
            this.name = name;
            this.surname = surname;
            this.job = job;
            this.isPet = isPet;
        }

        public Human (String surname, String job, boolean isPet) {
            this.surname = surname;
            this.job = job;
            this.isPet = isPet;
        }

        public Human (String surname, boolean isPet) {
            this.surname = surname;
            this.isPet = isPet;
        }











    }
}
