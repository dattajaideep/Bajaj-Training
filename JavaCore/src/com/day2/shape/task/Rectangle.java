package com.day2.shape.task;

public class Rectangle extends shape{
	int l,b;
	public double caluculateArea() {
		return l*b;
	}
	public Rectangle(int l,int b) {
		super("Rectangle");
		this.l=l;
		this.b=b;
		
	}
}
