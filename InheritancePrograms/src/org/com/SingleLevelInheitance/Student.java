package org.com.SingleLevelInheitance;

public class Student extends User {
	int rank;
	public static void main(String[] args) {
	
	//create object to child class
	Student s=new Student();
	s.name="manikanta";
	s.stdId=101;
	s.rank=99;
	System.out.println(s.name+"---"+s.stdId+"---"+s.rank);
	}
}