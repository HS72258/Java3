package com.company;

import java.util.Scanner;

public class noknod
{
    int nok;
    int nod;

    noknod()
    {
        nok = 1;
        nod = 1;
    }

    public static int nod(int num1, int num2)
    {
        return num2 == 0 ? num1 : nod(num2,num1 % num2);
    }

    public static int nok(int num1, int num2)
    {
        return num1 / nod(num1,num2) * num2;
    }

    public static void NOKNOD(int nok, int nod)
    {
        try {
            Scanner in = new Scanner(System.in);
            int num1, num2;
            num1 = in.nextInt();
            num2 = in.nextInt();
            System.out.println("Greatest Common Divisor: " + nod(num1,num2));
            System.out.println("Least Common Multiple: " + nok(num1,num2));
        }
        catch (Exception e){
            System.out.print("Not an integer is entered");
        }
    }
}