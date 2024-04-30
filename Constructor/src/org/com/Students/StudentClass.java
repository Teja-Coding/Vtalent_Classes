package org.com.Students;

public class StudentClass {
	public String name;
	public int age;
	public double tenthPercentage;
	public double interpercentage;
	public double degreePercentage;
	public double mastersPercentage;
	public StudentClass(String name, int age, double tenthPercentage, double interpercentage, double degreePercentage,
			double mastersPercentage) {
		this.name = name;
		this.age = age;
		this.tenthPercentage = tenthPercentage;
		this.interpercentage = interpercentage;
		this.degreePercentage = degreePercentage;
		this.mastersPercentage = mastersPercentage;
	}
	public StudentClass(String name, int age, double tenthPercentage, double interpercentage, double degreePercentage) {
		super();
		this.name = name;
		this.age = age;
		this.tenthPercentage = tenthPercentage;
		this.interpercentage = interpercentage;
		this.degreePercentage = degreePercentage;
	}
	public StudentClass(String name, int age, double tenthPercentage, double interpercentage) {
		super();
		this.name = name;
		this.age = age;
		this.tenthPercentage = tenthPercentage;
		this.interpercentage = interpercentage;
	}
	public StudentClass(String name, int age, double tenthPercentage) {
		super();
		this.name = name;
		this.age = age;
		this.tenthPercentage = tenthPercentage;
	}
	public StudentClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void studentDetails() {
		System.out.println("The name of the student= "+name);
		System.out.println("The age of the studnent= "+age);
		System.out.println("TenthPercentage= "+tenthPercentage);
		System.out.println("InterPercentage= "+interpercentage);
		System.out.println("DegreePercentage= "+degreePercentage);
		System.out.println("MasterPercentage= "+mastersPercentage);
		System.out.println("------------------------------------------");
	}
	
}
