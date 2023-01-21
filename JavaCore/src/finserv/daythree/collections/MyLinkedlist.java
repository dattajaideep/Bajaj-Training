package finserv.daythree.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedlist {
	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("Ram");
		list.add("Shayam");
		list.add("Kya");
		list.add("Jam");
		list.add("I am Hungry now");
		System.out.println(list);//Internally it is using toString to give the output
		
		//Sorting using collection
		Collections.sort(list);
		System.out.println("After Sorting");
		for(String name:list) {
			System.out.println(name);
		}
	}
}