package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        //args = new String[] {"-i", "0", "1"};
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person person;
        String name;
        Sex sex;
        Date bd;
        int id;

        switch (args[0]) {

            case ("-c"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; ) {
                        name = args[i];
                        bd = dateFormat.parse(args[i+2]);
                        if (args[i+1].equals("м")) {
                            allPeople.add(Person.createMale(name, bd));
                        }
                        else {
                            allPeople.add(Person.createFemale(name,bd));
                        }
                        System.out.println(allPeople.size()-1);
                        i+=3;
                    }
                }
                break;


            case ("-u"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; ) {
                        id = Integer.parseInt(args[i]);
                        name = args[i + 1];
                        sex = args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE;
                        bd = dateFormat.parse(args[i + 3]);
                        person = allPeople.get(id);
                        person.setName(name);
                        person.setSex(sex);
                        person.setBirthDate(bd);
                        i += 4;
                    }
                }
                break;

            case ("-d"):
                synchronized (allPeople) {
                    for (int i = 1; i<args.length; i++) {
                        id = Integer.parseInt(args[i]);
                        person = allPeople.get(id);
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                }
                break;

            case ("-i"):
                synchronized (allPeople) {
                    for (int i = 1; i<args.length; i++) {
                        id = Integer.parseInt(args[i]);
                        person = allPeople.get(id);
                        name = person.getName();
                        String sexStr = person.getSex().equals(Sex.MALE)? "м" : "ж";
                        dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        String bdStr = dateFormat.format(person.getBirthDate());
                        System.out.println(name + " " + sexStr + " " + bdStr);
                    }
                }
                break;


        }
    }
}
