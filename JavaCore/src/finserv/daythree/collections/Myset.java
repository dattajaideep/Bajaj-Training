package finserv.daythree.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Myset {

	public static void main(String[] args) {
		myHashSet();
		mylinkedHashSet();
		myTreeHashSet();
	}
	public static void myHashSet() {
		Set<String> set=new HashSet<String>();
		set.add("Ram");
		set.add("Shayam");
		set.add("Kya");
		set.add("jam");
		set.add("Mhe Bhuka Hua");
		System.out.println(set);
	}
	public static void mylinkedHashSet() {
		Set<String> set=new LinkedHashSet<String>();
		set.add("Ram");
		set.add("Shayam");
		set.add("Kya");
		set.add("jam");
		set.add("Mhe Bhuka Hua");
		System.out.println(set);
	}
	public static void myTreeHashSet() {
		Set<String> set=new TreeSet<String>();
		set.add("Ram");
		set.add("Shayam");
		set.add("Kya");
		set.add("jam");
		set.add("Mhe Bhuka Hua");
		System.out.println(set);
	}

}
