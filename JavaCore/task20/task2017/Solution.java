package com.javarush.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/

public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {

        Object o = null;
        try {
            o = objectStream.readObject();
        } catch (Exception e) {
            return null;
        }
        if (o instanceof A) {
            return (A)o;
        }
        else {
            return null;
        }


    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
