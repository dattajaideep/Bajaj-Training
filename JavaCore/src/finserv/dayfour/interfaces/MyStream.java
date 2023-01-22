package finserv.dayfour.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(2,3,4,5,6,7,8,9,10);
		
	    // Filter even numbers
	    List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
	    System.out.println("Even numbers: " + evenNumbers);

	    // Map numbers to their squares
	    List<Integer> squares = numbers.stream().map(num -> num * num).collect(Collectors.toList());
	    System.out.println("Squares: " + squares);

	    // Find the sum of all numbers
	    int sum = numbers.stream().reduce(0, (a, b) -> a + b);
	    System.out.println("Sum of all numbers: " + sum);

	    // Find the max number
	    int max = numbers.stream().max(Integer::compareTo).get();
	    System.out.println("Max number: " + max);

	    // Find the minimum number
	    int min = numbers.stream().min(Integer::compareTo).get();
	    System.out.println("Min number: " + min);
	}
}
