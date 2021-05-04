package com.javarush.task.task05.task0505;

/* 
 create 3 cats, call fight() for each pair
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat Lolo = new Cat("Lolo",5,5,7);
        Cat Toto = new Cat("Toto",2,4,3);
        Cat Bobo = new Cat("Bobo",4,5,2);
        System.out.println(Lolo.fight(Toto));
        System.out.println(Lolo.fight(Bobo));
        System.out.println(Toto.fight(Bobo));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
