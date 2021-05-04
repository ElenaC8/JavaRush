package com.javarush.task.task08.task0827;

/* 
 working with date
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        SimpleDateFormat currentFormat =  new SimpleDateFormat ("MMMM dd yyyy", Locale.ENGLISH);
        Date parsedDate = new Date(date);

        SimpleDateFormat newFormat = new SimpleDateFormat("D", Locale.ENGLISH);
        int daysFromStartYear = Integer.parseInt(newFormat.format(parsedDate));

        if (daysFromStartYear%2 != 0) {
            return true;
        }
        else {
            return false;
        }


    }
}
