package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
 the largest string
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>(5);
        int dlina = 0;
        for( int i=0; i<5; i++){
            String str = s.readLine();
            strings.add(str);
            if (dlina<=strings.get(i).length())
            dlina = strings.get(i).length();
            else
            dlina = dlina;
        }
        for (int i=0; i<5; i++){
            if (strings.get(i).length() == dlina)
            System.out.println(strings.get(i));
            
        }
        
        
    }
}
