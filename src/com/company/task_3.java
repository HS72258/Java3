package com.company;

import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class task_3 {

    public static String firstUpperCase(String word)
    {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public static void Task3()
    {
        try {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            str = str.replaceAll("[^a-z^A-Z^ ]", "").toString();
            String[] mass = str.split(" ");
            Arrays.sort(mass, String.CASE_INSENSITIVE_ORDER);
            System.out.println("Length: " + mass.length);
            for (String i : mass) {
                System.out.print(firstUpperCase(i) + " ");
            }
        }
        catch (Exception e){
            System.out.println("The entered text with errors");
        }
    }
}
