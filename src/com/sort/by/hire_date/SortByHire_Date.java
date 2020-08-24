package com.sort.by.hire_date;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SortByHire_Date {

	public static void main(String[] args) {
		
		Employee e1=new Employee("Sally", new Date(2011-2015, 11, 15));
		Employee e2=new Employee("Irving", new Date(2011-2015, 11, 13));
		Employee e3=new Employee("Eva", new Date(2011-2015, 11, 16));
		Employee e4=new Employee("David", new Date(2011-2015, 11, 18));
		Employee e5=new Employee("James", new Date(2011-2015, 11, 17));
		
		List<Employee> employee=new ArrayList<Employee>();
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		
		Collections.sort(employee, new SortHireDate());
		System.out.println(employee);

	}

}
