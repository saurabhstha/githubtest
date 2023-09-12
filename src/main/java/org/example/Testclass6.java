package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Testclass6 {
    public static void main(String[] args) {

        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        System.out.println("Before Swapping " + x + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping " + x + y);
    }
}

    /*{
     String str = "Ab$ 89k@ dfDf5P^*";
     int count = str.replaceAll("[a-zA-Z0-9\s]","").length();

     System.out.println(count);
    }*/


/*        String str = "fdgf5fgu5yu66sfsf";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("Total numerical values: " + count);*/

/*        String word = "Hi everyone how are you doing";
        String[] arr = word.split(" ");
        System.out.println(Arrays.toString(arr));

        String [] new_arr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String res = "";
            for (int j = arr[i].length() - 1; j >= 0 ; j--) {
                res = res + arr[i].charAt(j);
            }

            arr[i] = res;
        }

        System.out.println(Arrays.toString(arr));


        int count = 0;
        for (int i = 0; i <= arr.length-1; i++) {

            new_arr[count++] = arr[i];

        }

        String res = String.join(" ", new_arr);

        System.out.println(res);*/