package com.Day1.basics;
import java.util.*;
public class Maxthree {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		System.out.println(Math.max(a,Math.max(b, c)));
	}
}
