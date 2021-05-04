package com.javarush.task.task02.task0217;

/* 
 find min of 4 numbers
*/
public class Solution {

    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int m = min (a, b);
        int m2 = 0;

        if ( m <= c && m <= d) {
            m2 = m;
        } else if (m >= c && c <= d) {
            m2 = c;
        } else if (m >= d && c >= d) {
            m2 = d;
        }
        
        return m2;

    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        if (a < b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}