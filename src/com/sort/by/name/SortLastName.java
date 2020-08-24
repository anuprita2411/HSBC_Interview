package com.sort.by.name;

import java.util.Comparator;

public class SortLastName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {

		
				return o1.getLastname().compareTo(o2.getLastname());
			
		
	}

}
