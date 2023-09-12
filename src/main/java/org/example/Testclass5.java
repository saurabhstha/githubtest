package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Testclass5 {
    public static void main(String[] args) {

        String str = "Elle";
        char ch;
        String reversestr = "";


        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reversestr = ch + reversestr;
        }
        if (str.toLowerCase().equals(reversestr)) {
            System.out.println("This is palandrome: " + reversestr);
        }
       else {
            System.out.println("This is not a palandrome: " + reversestr);
        }
    }
}



        /*
        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (char ch: str.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+5);
        }

        System.out.println(freq);*/

