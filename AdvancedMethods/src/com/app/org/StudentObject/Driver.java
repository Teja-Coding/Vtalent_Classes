package com.app.org.StudentObject;

//Write a java method to print data available in the Student object...
public class Driver {
	public static void main(String[] args) {
		Driver d = new Driver();
		Student s = new Student();
		
		s.id=101;
		s.name="manikata";
		d.print(s);
		
	}
	void print(Student stu) {
		System.out.println(stu.id+"......."+stu.name);
	}
}
class Student{
	public int id;
	public String name;
}
