package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        StringBuilder str = new StringBuilder();
        while (fileReader.ready()) {
            String s = fileReader.readLine();
            str.append(s.trim());
        }
        fileReader.close();

        //System.out.println(str.toString());

        String readedInfo = str.toString();

        Pattern pattern1 = Pattern.compile("<[a-zA-z].*?>");
        Matcher matcher1 = pattern1.matcher(readedInfo);

        Pattern pattern2 = Pattern.compile("</.*?>");
        Matcher matcher2 = pattern2.matcher(readedInfo);

        ArrayList<Integer> indexStartp1 = new ArrayList<>();
        ArrayList<Integer> indexEndp2 = new ArrayList<>();

        while(matcher1.find()) {
            indexStartp1.add(matcher1.start());
            //System.out.print(readedInfo.substring(matcher1.start(), matcher1.end())+ " "+ matcher1.start());
        }

        while (matcher2.find()) {
            indexEndp2.add(matcher2.end());
            //System.out.print(readedInfo.substring(matcher2.start(), matcher2.end()) + " "+ matcher2.end());
        }
        //System.out.println();

        int start = 0;
        int end = 0;
        int level = 0;


        for (int i = 0; i<indexStartp1.size(); ) {
            while ((i<indexStartp1.size()) && (indexStartp1.get(i) < indexEndp2.get(0))) {
                level++;
                //System.out.println("indexStartp1.get(i) < indexEndp2.get(0)" + indexStartp1.get(i) + "<" + indexEndp2.get(0));
                //System.out.println("level "+ level);
                i++;

            }
            //System.out.println();
            start = indexStartp1.get(0);
            end = indexEndp2.get(level-1);
            System.out.println(readedInfo.substring(start,end));
            //System.out.println();

            for (int y = 0; y < level; y++) {
                indexStartp1.remove(0);
                indexEndp2.remove(0);
                /*System.out.println("indexStartp1.size() " + indexStartp1.size());
                System.out.println("indexEndp2.size() " + indexEndp2.size());*/

            }
            level = 0;
            i = 0;
        }



    }
}
