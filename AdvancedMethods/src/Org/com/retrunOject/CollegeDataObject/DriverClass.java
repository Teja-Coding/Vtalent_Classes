package Org.com.retrunOject.CollegeDataObject;

public class DriverClass {
	public static void main(String[] args) {
		DriverClass dc=new DriverClass();
		CollegeClass c=dc.print();
		System.out.println("student id: "+c.studentId);
		System.out.println("student name: "+c.studentName);
		System.out.println("student email: "+c.email);
		System.out.println("student phoneNumber: "+c.phoneNumber);
		System.out.println("student collegeName: "+CollegeClass.CollegeName);
	}
	CollegeClass print() {
		CollegeClass cc=new CollegeClass();
		cc.studentId=1;
		cc.phoneNumber=9494013905l;
		cc.email="v.y.t.manikanta@gmail.com";
		cc.studentName="manikanta";
		return cc;
		
	}
}
