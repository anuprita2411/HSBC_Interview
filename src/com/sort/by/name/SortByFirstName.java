package com.sort.by.name;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByFirstName {

	public static void main(String[] args) {
		
		Employee e1=new Employee("Sally", "KWAN");
		Employee e2=new Employee("Irving", "Strean");
		Employee e3=new Employee("Eva", "Pulaski");
		Employee e4=new Employee("David", "Brown");
		Employee e5=new Employee("James", "Walker");
		
		List<Employee> employees=new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		Collections.sort(employees, new SortFirstName());
		System.out.println(employees);

	}

}
