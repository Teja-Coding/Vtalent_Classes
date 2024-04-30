package org.com.Students;

public class StudentOverloading {
	public static void main(String[] args) {
		StudentClass manikanta=new StudentClass("manikanta",24,62.2,65.2,63.2,66.2);
		manikanta.studentDetails();
		
		StudentClass yuva=new StudentClass("yuva",25,65.2,62.1,60.3);
		yuva.studentDetails();
		
	}
}
