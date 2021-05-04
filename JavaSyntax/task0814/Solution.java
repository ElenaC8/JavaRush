package com.javarush.task.task08.task0814;

import java.util.*;

/* 
 delete all numbers >10
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();
            for (int i=0; i<20; i++)
            {
                set.add(i);
            }
            return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> it = set.iterator();
            while (it.hasNext())
            {
                if (it.next() > 10)
                {
                    it.remove();
                }
            }
            return set;

        }

    public static void main(String[] args) {

    }
}
