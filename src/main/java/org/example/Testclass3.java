package org.example;

import java.util.ArrayList;
import java.util.List;

public class Testclass3 {
    public static void main(String[] args) {
        int a[] = {4, 7, 8, 9};

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

        List<Integer> Listofnums = new ArrayList<>();
        Listofnums.add(5);
        Listofnums.add(4);
        Listofnums.add(81);
        Listofnums.add(66);
        Listofnums.add(12);
        Listofnums.add(1);

        for (int i = 0; i < Listofnums.size(); i++) {
            System.out.println(Listofnums.get(i));
        }

    }
}
