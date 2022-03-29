package com.jdbc;

import java.time.LocalDate;

public class EmployeePayrollData {
	private int id ;
	private String name;
	private double salary;
	private LocalDate Start;
	public EmployeePayrollData(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public EmployeePayrollData(int id, String name, double salary, LocalDate start) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		Start = start;
	}
	@Override
	public String toString() {
		return "EmployeePayrollData [id=" + id + ", name=" + name + ", salary=" + salary + ", Start=" + Start + "]";
	}
	
	

}
