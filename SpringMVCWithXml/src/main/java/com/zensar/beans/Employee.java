package com.zensar.beans;

import org.hibernate.validator.constraints.Range;

public class Employee {
	@Range()
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	//private Address address;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	public Employee(int employeeId, String employeeName, int employeeSalary/*,Address address*/) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		//this.address=address;
	}
	public Employee() {
		super();
		System.out.println("Good Morning !!!!");
	}
	/*public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
	
	
	
	

}
