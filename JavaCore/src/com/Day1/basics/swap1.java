package com.Day1.basics;
import java.util.*;
public class swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		int tmp=a;
		a=b;
		b=tmp;
		System.out.println(a+" "+b);
	}

}
