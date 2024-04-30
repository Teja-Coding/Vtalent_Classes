package org.com.HdfcProject;

public class HdfcProject {
	private String accholderName;
	private long phNo;
	private String AccNo;
	private long adharNo;
	private String dob;
	
	public HdfcProject(String accholderName, long phNo, String accNo, long adharNo, String dob) {
		super();
		this.accholderName = accholderName;
		this.phNo = phNo;
		AccNo = accNo;
		this.adharNo = adharNo;
		this.dob = dob;
	}
	public String getAccholderName() {
		return accholderName;
	}
	public void setAccholderName(String accholderName) {
		this.accholderName = accholderName;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getAccNo() {
		return AccNo;
	}
	public void setAccNo(String accNo) {
		AccNo = accNo;
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
	@Override
	public String toString() {
		return "HdfcProject [accholderName=" + accholderName + ", phNo=" + phNo + ", AccNo=" + AccNo + ", adharNo="
				+ adharNo + ", dob=" + dob + "]";
	}
	
	
}
