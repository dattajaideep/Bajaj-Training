package finserv.daythree.collections;

import java.util.Collections;
import java.util.Vector;

public class MyVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector=new Vector<String>();
		vector.add("Ram");
		vector.add("Shayam");
		vector.add("Kya");
		vector.add("Jam");
		vector.add("I am Hungry now");
		//Stack is a sub-class of vector
		//Sorting using collection
		Collections.sort(vector);
		for (String str : vector)System.out.print(str + " ");
	}
}
