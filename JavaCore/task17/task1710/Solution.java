package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //args = new String[] {"-i", "0"};
        //start here - начни тут
        switch (args[0]) {
            case ("-c"):
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                Date bd = dateFormat.parse(args[3]);
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], bd));
                }
                else {
                    allPeople.add(Person.createFemale(args[1], bd));
                }
                System.out.println(allPeople.size()-1);
                break;

            case ("-u"):
                dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                bd = dateFormat.parse(args[4]);
                int id = Integer.parseInt(args[1]);
                Sex sex;
                if (args[3].equals("м")) {
                    sex = Sex.MALE;
                }
                else {
                    sex = Sex.FEMALE;
                }
                Person changePerson = allPeople.get(id);
                changePerson.setName(args[2]);
                changePerson.setSex(sex);
                changePerson.setBirthDate(bd);
                break;

            case ("-d"):
                id = Integer.parseInt(args[1]);
                Person deletePerson = allPeople.get(id);
                deletePerson.setSex(null);
                deletePerson.setBirthDate(null);
                deletePerson.setName(null);
                break;

            case ("-i"):
                id = Integer.parseInt(args[1]);
                String seX;
                if (allPeople.get(id).getSex().toString().equals("MALE")) {
                    seX = "м";
                }
                else {
                    seX = "ж";
                }
                dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                String date = dateFormat.format(allPeople.get(id).getBirthDate());
                System.out.println(allPeople.get(id).getName() + " " + seX + " " + date);
        }


    }
}
