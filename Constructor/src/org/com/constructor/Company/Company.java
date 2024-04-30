package org.com.constructor.Company;

public class Company {
	public String empName,company,jobTitle;
	public int salary;
	public Company(String empName, String company, String jobTitle, int salary) {

		this.empName = empName;
		this.company = company;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	public void detailsOfEmplyee() {
		System.out.println("emplyee name: "+empName);
		System.out.println("company name: "+company);
		System.out.println("jobTitle: "+jobTitle);
		System.out.println("monthly salary "+salary);
	}
	
	
	
}
