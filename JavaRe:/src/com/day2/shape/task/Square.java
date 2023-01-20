package com.day2.shape.task;

public class Square extends shape{
	protected int side;
	public Square(int side) {
		super("square");
		this.side=side;
	}
	
	public double caluculateArea() {
		return side*side;
	}

}
