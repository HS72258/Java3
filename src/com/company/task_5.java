package com.company;

import java.util.Scanner;

public class task_5
{
    public static int recursion(int n, int i) {
        return (n == 0) ? i : recursion(n / 10, i * 10 + n % 10);
    }
        public static void Task5()
    {
        Scanner in = new Scanner(System.in);
        int num;
        do {
            num = in.nextInt();
        }while(num <0 || num > 100);
        for(int i = 1; i <= num; i++)
        {
            if (i == recursion(i,0))
                System.out.println(i);
        }
    }
}
