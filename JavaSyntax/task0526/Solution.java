package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Vasya", 20, "Moskva");
        Man man2 = new Man("Kolya", 30, "Piter");
        Woman woman1 = new Woman("Olya", 30, "Perm");
        Woman woman2 = new Woman("Vika", 32, "Kiev");
        
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;
        
        public Man (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    
    public static class Woman {
        String name;
        int age;
        String address;
        
         public Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        
    } 
}
