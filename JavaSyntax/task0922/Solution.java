package com.javarush.task.task09.task0922;

/* 
Display the entered date as  "AUG 18, 2013".
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        SimpleDateFormat startFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = startFormat.parse(s);
        SimpleDateFormat newFormat = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(newFormat.format(date).toUpperCase());


    }
}
