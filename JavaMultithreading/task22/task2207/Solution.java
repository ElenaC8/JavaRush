package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        try {
            fileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> words = new ArrayList<>();

        try  {
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                String[] lines = line.split(" ");
                for (int i = 0; i< lines.length; i++) {
                    words.add(lines[i]);
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i<words.size(); i++) {
            StringBuilder b = new StringBuilder(words.get(i));
            b.reverse();

            for (int j = i+1; j<words.size(); j++) {
                    if (b.toString().equals(words.get(j))) {
                        Pair pair = new Pair();
                        pair.first = words.get(i);
                        pair.second = words.get(j);
                        result.add(pair);
                        words.remove(i);
                        i--;
                        j--;
                        words.remove(j);
                        break;
                    }

            }
        }

        /*for (Pair p:result) {
            System.out.println(p.toString());
        }*/


    }

    public static class Pair {
        String first;
        String second;

        public Pair() {

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
