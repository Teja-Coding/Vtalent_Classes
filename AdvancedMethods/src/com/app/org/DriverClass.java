package com.app.org;

//write a java method which will give Person object with data 


public class DriverClass {
	public static void main(String[] args) {
		DriverClass dc=new DriverClass();
		
		Person p1=dc.print();
		
		System.out.println("person id: "+p1.id);
		System.out.println("person age:"+p1.age);
		System.out.println("person name:"+p1.name);
		System.out.println("-------------------------");
		
	}
	Person print() {
		Person p=new Person();
		p.id=101;
		p.age=45;
		p.name="yuva";
		
		return p;
		
	}
	
}
class Person{
	int id;
	String name;
	int age;
}
