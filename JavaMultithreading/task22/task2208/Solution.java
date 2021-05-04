package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {

        /*Map<String, String> m = new HashMap<>();
        m.put(null, null);
        m.put(null, null);
        m.put(null, null);
        getQuery(m);*/
    }

    public static String getQuery(Map<String, String> params) {

        String result = null;
        StringBuilder build = new StringBuilder();

        for (Map.Entry<String, String> pair: params.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (key != null && value != null) {
                build.append(key);
                build.append(" = '");
                build.append(value);
                build.append("' and ");
            }

       }
        if (build.length() == 0) {
            result = "";
        }
        else {
            int finalPoint = build.lastIndexOf(" and ");
            result = build.substring(0,finalPoint).toString();
        }

        System.out.println(result);



        return result;
    }
}
