package finserv.daythree.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import finserv.daytwo.relations.Employee;

public class MySetEmployee {
	public static void myEmployeeSet() {
		Employee emp1=new Employee(101,"Shaha",60);
		Employee emp2=new Employee(102,"Sha",70);
		Employee emp3=new Employee(103,"Suuu",80);
		Employee emp4=new Employee(103,"Suuu",80);
		
		Set<Employee> set=new HashSet<Employee>();
		Set<Employee> set1=new TreeSet<Employee>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set1.add(emp1);
		set1.add(emp2);
		set1.add(emp3);
		set1.add(emp4);
		System.out.println(set);
		System.out.println(set1);
	}
	public static void main(String[] args) {
		MySetEmployee.myEmployeeSet();
	}
}
