package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        PersonScannerAdapter(Scanner scanner) {
            fileScanner = scanner;
        }


        @Override
        public Person read() throws IOException {
            String personData = fileScanner.nextLine();
            String[] dataArray = personData.split(" ");
            String firstName = dataArray[1];
            String middleName = dataArray[2];
            String lastName = dataArray[0];
            int dayOfBirth = Integer.parseInt(dataArray[3]);
            int monthOfBirth = Integer.parseInt(dataArray[4])-1;
            int yearOfBirth = Integer.parseInt(dataArray[5])-1900;
            Date birthday = new Date(yearOfBirth,monthOfBirth,dayOfBirth);


            return new Person(firstName, middleName, lastName, birthday);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
