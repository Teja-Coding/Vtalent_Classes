package org.com.PojoClass;

public class Hdfc {
	private String accHolderName;
	private long  phNo;
	private String accNo;
	private long adharNo;
	private String dob;
	private int age;
	
	public Hdfc(String accHolderName, long phNo, String accNo, long adharNo, String dob, int age) {
		super();
		this.accHolderName = accHolderName;
		this.phNo = phNo;
		this.accNo = accNo;
		this.adharNo = adharNo;
		this.dob = dob;
		this.age = age;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
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
	
	
	
}