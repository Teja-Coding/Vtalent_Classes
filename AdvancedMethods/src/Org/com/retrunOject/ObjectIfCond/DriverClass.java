package Org.com.retrunOject.ObjectIfCond;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("To get details of student\nenter the studentId\nUmaId=101\nMouni=102\nRamesh=103\nENTER THE ID NUMBER FOR DETAILS: ");
		
		 DriverClass dc = new DriverClass();
		 StudentsClass sc=dc.print(scanner.nextInt());
		 
		 System.out.println("Student Id Number : "+sc.id);
		 System.out.println("Student Name : "+sc.name);
		 System.out.println("Student EmaiId : "+sc.email);
		 System.out.println("Student Branch : "+sc.branch);
		 System.out.println("College Name : "+StudentsClass.collegeName);
		 
	}
	StudentsClass print(int id) {
		StudentsClass s=new StudentsClass();
		if(id==101) {
			s.id=101;
			s.name="uma";
			s.email="uma123@gmail.com";
			s.branch="ECE";
		}
		else if(id==102) {
			s.id=102;
			s.name="mouni";
			s.email="mouni123@gmail.com";
			s.branch="CSE";

		}
		else if(id==103) {
			s.id=103;
			s.name="Ramesh";
			s.email="Ramesh123@gmail.com";
			s.branch="EEE";
		}
		else {
			System.out.println("student not found");
		}
		
	
		return s;
		
	}
}
