package com.sort.by.hire_date;

import java.util.Comparator;

public class SortHireDate implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.joiningdate.compareTo(o2.joiningdate);
		
	}

	
	
	

}
