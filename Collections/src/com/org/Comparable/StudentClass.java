package com.org.Comparable;

public class StudentClass implements Comparable<StudentClass> 	 {
	int id;
	String name;
	int marks;
	public StudentClass(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentClass [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(StudentClass s) {
	
//		based on marks....
//		return s.marks-this.marks;
		return this.marks-s.marks;
		
//		//based on id
//		return s.id-this.id;
//		
		
		//based on names....
		//return this.name.compareTo(s.name);
		
		
	}
	
	
}