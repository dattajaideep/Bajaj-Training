package finserv.daythree.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Myarraylist {
	public static void main(String[] args) {
		Myarraylist.myArrayList();
	}
	public static void myArrayList() {
		List<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Shayam");
		list.add("Kya");
		list.add("Jam");
		list.add("I am Hungry now");
		System.out.println(list);//Internally it is using toString to give the output
		
		//For
		System.out.println("Simple FOR");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//Advanced FOR
		System.out.println("Adv FOR");
		for(String name:list) {
			System.out.println(name);
		}
		//Iterator
		System.out.println("Iterator");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//List Iterator
		System.out.println("List Iterator");
		ListIterator<String> litr=list.listIterator();
		System.out.println("Print striaght");
		while(litr.hasNext()){
		       System.out.println(litr.next());
		    }
		System.out.println("Print Reverse");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		//Sorting using collection
		Collections.sort(list);
		System.out.println("After Sorting");
		for(String name:list) {
			System.out.println(name);
		}
		
	}

}
