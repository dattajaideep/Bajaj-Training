package com.Day1.basics;
import java.util.*;
public class cubenum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		sc.close();
		System.out.println(cube(a));
	}
	public static int cube(int x) {
		int y=x*x*x;
		return y;
	}
}
