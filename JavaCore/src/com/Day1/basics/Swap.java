package com.Day1.basics;
import java.util.*;
class Swap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        sc.close();
//        a=a+b;
//        b=a-b;
//        a=a-b;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }
}