package com.sort.by.hire_date;

import java.util.Date;

public class Employee {
	
	private String empname;
	Date joiningdate;
	
	public Employee(String empname, Date joiningdate) {
		super();
		this.empname = empname;
		this.joiningdate = joiningdate;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", joiningdate=" + joiningdate + "]";
	}


	
}

