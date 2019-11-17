package com.company;
import java.util.Scanner;

public class task_1
{
    boolean chet;
    boolean prosost;

    task_1()
    {
        chet = false;
        prosost = false;
    }

    public static void Task1(boolean chet, boolean prosost)
    {
        try {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            if (num % 2 == 0)
                chet = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prosost = true;
                    break;
                }
            }
            if(chet)
                System.out.println("Number is even");
            else System.out.println("Number is not even");
            if(!prosost)
                System.out.println("Number is simple");
            else System.out.println("Number is compound");
            }

        catch (Exception e)
        {
            System.out.print("Not an integer is entered");
        }
    }
}
