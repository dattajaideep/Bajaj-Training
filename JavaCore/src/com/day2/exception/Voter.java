package com.day2.exception;

public class Voter {
	public void validateage(int Age) {
		try {
			if(Age>=18) {
				
			}
			else {
				throw new AgeInvalidException("Age needs to be above 17");
			}
		} catch (AgeInvalidException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public void justFun() {
		System.out.println("No Problem");
	}
}
