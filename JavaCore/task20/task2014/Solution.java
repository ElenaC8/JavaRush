package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable {
    public static void main(String[] args) {

        System.out.println(new Solution(4));

        Solution savedObject = new Solution(4);
        // save to file
        FileOutputStream fileOutput;
        ObjectOutputStream outputStream;
        {
            try {
                fileOutput = new FileOutputStream("C:\\Users\\E\\Desktop\\1.txt");
                outputStream = new ObjectOutputStream(fileOutput);
                outputStream.writeObject(savedObject);
                fileOutput.close();
                outputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Solution loadedObject = null;
        // load from file
        FileInputStream fileInput;
        ObjectInputStream inputStream;
        {
            try {
                fileInput = new FileInputStream("C:\\Users\\E\\Desktop\\1.txt");
                inputStream = new ObjectInputStream(fileInput);
                loadedObject = (Solution) inputStream.readObject();
                fileInput.close();
                inputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        System.out.println(loadedObject.string.equals(savedObject.string));

    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }


}
