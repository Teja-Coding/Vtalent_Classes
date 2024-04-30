package Org.com.retrunOject.PersonRetrun;

//write a java method which will give Person object with data 


public class DriverClass {
	public static void main(String[] args) {
		DriverClass dc=new DriverClass();
		PersonClass p=dc.print();
		
		System.out.println("person id: "+p.id);
		System.out.println("person name: "+p.name);
		System.out.println("person age:"+p.age);
		
	}
	PersonClass print() {
		PersonClass pc=new PersonClass();
		pc.id=101;
		pc.name="manikanta";
		pc.age=24;
		
		return pc;
	}
	
}
