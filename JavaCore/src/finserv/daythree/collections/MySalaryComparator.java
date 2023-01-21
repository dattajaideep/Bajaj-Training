package finserv.daythree.collections;

import java.util.Comparator;

import finserv.daytwo.relations.Employee;

public class MySalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()>o2.getSalary())
			return 1;
		else if(o1.getSalary()>o2.getSalary())
			return -1;
		else
		return 0;
	}
	
}
