package com.company;

import java.util.Scanner;

public class task_4
{
    public static void Task4()
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String word = in.nextLine();
        byte count = 0;
        str = str.replaceAll("[^a-z^A-Z]"," ").toString();
        String[] mass = str.split(" ");
        for (String i:mass)
        {
            if (i.matches(".*"+word+".*"))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
