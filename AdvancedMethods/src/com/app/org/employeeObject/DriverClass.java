package com.app.org.employeeObject;

public class DriverClass {
	public static void main(String[] args) {
		DriverClass dc=new DriverClass();
		EmployeeClass ec = new EmployeeClass();
		
		ec.id=101;
		ec.salary=50000.55;
		ec.phno=9494013905l;
		ec.name="manikanta";
		
		dc.Print(ec);
		
	}
	void Print(EmployeeClass e) {
		System.out.println("Employee Id is "+e.id);
		System.out.println("Employee Salary "+e.salary);
		System.out.println("Employee phone number "+e.phno);
		System.out.println("Employhee name "+e.name);
		System.out.println("Employee company name "+EmployeeClass.companyName);
	}
}
