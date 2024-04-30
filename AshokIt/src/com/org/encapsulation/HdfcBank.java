package com.org.encapsulation;

public class HdfcBank {
	
	private String name;
	private long phno;
	private String accNumber;
	private long aadharNumber;
	private String dob;
	private int age;
	
	public HdfcBank(String name, long phno, String accNumber, long aadharNumber, String dob, int age) {
		
		this.name=name;
		this.phno=phno;
		this.accNumber=accNumber;
		this.aadharNumber=aadharNumber;
		this.dob=dob;
		this.age=age;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public long getPhno(long phno) {
		return phno;
	}
	public void setPhno() {
		this.phno=phno;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "HdfcBank [name=" + name + ", phno=" + phno + ", accNumber=" + accNumber + ", aadharNumber="
				+ aadharNumber + ", dob=" + dob + ", age=" + age + "]";
	}
	
	

}
