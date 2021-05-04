package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader readerFile1 = new BufferedReader(new FileReader(file1));
        ArrayList<String> listFile1 = new ArrayList<>();
        while (readerFile1.ready()) {
            listFile1.add(readerFile1.readLine());
        }
        readerFile1.close();

        BufferedReader readerFile2 = new BufferedReader(new FileReader(file2));
        ArrayList<String> listFile2 = new ArrayList<>();
        while (readerFile2.ready()) {
            listFile2.add(readerFile2.readLine());
        }
        readerFile2.close();

        while (true) {

            if (listFile1.size()<1) {
                for (String s: listFile2) {
                    lines.add(new LineItem(Type.ADDED, s));
                }
                break;
            }

            if (listFile2.size()<1) {
                for (String s: listFile1) {
                    lines.add(new LineItem(Type.REMOVED, s));
                }
                break;
            }

            if (listFile1.get(0).equals(listFile2.get(0))) {
                lines.add(new LineItem(Type.SAME, listFile1.get(0)));
                listFile1.remove(0);
                listFile2.remove(0);
            }

            else if (!listFile1.get(0).equals(listFile2.get(0)) && (listFile2.get(0).equals(listFile1.get(1)))) {
                lines.add(new LineItem(Type.REMOVED, listFile1.get(0)));
                listFile1.remove(0);

            }

            else if (!listFile1.get(0).equals(listFile2.get(0)) && (listFile1.get(0).equals(listFile2.get(1)))){
                lines.add(new LineItem(Type.ADDED, listFile2.get(0)));
                listFile2.remove(0);

            }
        }

        /*for (LineItem l:lines) {
            System.out.println(l.type.toString() +" " + l.line);
        }*/

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
