package com.day2.shape.task;

public class Circle extends shape{
	int radius;
	public Circle(int radius) {
		super("Circle");
		this.radius=radius;
	}
	public double caluculateArea() {
		return 3.14*radius*radius;
	}
	
}
