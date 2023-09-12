package org.example;

import java.util.*;

public class Testclass4 {
    public static void main(String[] args) {
        String str = "elepahant";
/*        Set<Character> set = new HashSet<>();*/
        List<Character> uniquevalues = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                uniquevalues.add(ch);
            }
        }
        System.out.println(uniquevalues);

//       for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (set.add(ch)) {
//                uniquevalues.add(ch);
//            }
//        }


    }
}
   /* public static void main(String[] args) {
*//*       Set<Integer> set = new HashSet<>(); - does not guarantee order, faster
        Set<Integer> set = new LinkedHashSet<>();- follows order of insertion*//*
        Set<Integer> set = new LinkedHashSet<>(); //in the ascending order


        set.add(4);
        set.add(5);
        set.add(1);

        for (int num: set) {
            System.out.println(num);
        }
    }*/