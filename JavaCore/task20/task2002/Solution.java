package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = new File("C:\\Users\\E\\Desktop\\1.txt");
                    //File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("Rubi");
            user.setLastName("Rail");
            user.setBirthDate(new Date(1508944516168L));
            user.setMale(true);
            user.setCountry(User.Country.OTHER);
            javaRush.users.add(user);

            User user1 = new User();
            user1.setFirstName("Roman");
            user1.setLastName("Bubnov");
            user1.setCountry(User.Country.OTHER);
            user1.setMale(false);
            Date date1 = new Date(1998,7,17);
            user1.setBirthDate(date1);
            javaRush.users.add(user1);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush.equals(loadedObject));



            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));

            String isUsersEmpty = users.size() <1? "yes":"no";
            writer.write(isUsersEmpty+"\n");
            writer.flush();

            if (users.size() > 0) {
                for (User s: users) {
                    writer.write(s.getFirstName()+"\n");
                    writer.write(s.getLastName()+"\n");
                    writer.write(String.valueOf(s.getBirthDate().getTime())+"\n");
                    writer.write(String.valueOf(s.isMale())+"\n");
                    writer.write(s.getCountry().getDisplayName()+"\n");
                }

            }
            writer.close();


        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String isUsersEmpty = reader.readLine();

            while (reader.ready()) {

                if (isUsersEmpty.equals("no")) {
                    User user = new User();

                    String name = reader.readLine();
                    String lastName = reader.readLine();
                    long date = Long.parseLong(reader.readLine());
                    boolean isMale = Boolean.valueOf(reader.readLine());
                    String countryName = reader.readLine();
                        switch (countryName) {
                            case "Russia":
                                user.setCountry(User.Country.RUSSIA);
                                break;
                            case "Ukraine":
                                user.setCountry(User.Country.UKRAINE);
                                break;
                            case "Other":
                                user.setCountry(User.Country.OTHER);
                        }

                    user.setFirstName(name);
                    user.setLastName(lastName);
                    user.setBirthDate(new Date(date));
                    user.setMale(isMale);

                    users.add(user);
                }

            }
            System.out.println(users.size());
            reader.close();

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
