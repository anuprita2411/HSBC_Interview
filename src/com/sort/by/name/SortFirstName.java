package com.sort.by.name;

import java.util.Comparator;

public class SortFirstName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
	
			return o1.getFirstname().compareTo(o2.getFirstname());
		
	}

}
