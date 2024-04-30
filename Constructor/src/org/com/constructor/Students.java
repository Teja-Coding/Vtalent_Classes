package org.com.constructor;

public class Students {
	public String name;
	public int id;
	public int age;
	public String gender;
	public Students(String name, int id,int age, String gender) {

		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		
		System.out.println("name of the student: "+name+"\nsdudent Id: "+id+"\nAge of student: "+age);
		System.out.println("student gender: "+age);
	}
	public static void main(String[] args) {
		Students s=new Students("mani", 101, 21,"male" );
	}
	

}
