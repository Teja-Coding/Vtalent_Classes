package org.com.PojoClass;

public class MainCon {
	public static void main(String[] args) {
		
	Hdfc h=new Hdfc("manikanta", 9494013905l, "a8g48g5h4", 9494013905l, "13-may-1999", 24);
	h.setAge(18);
	System.out.println("name of the holder: "+h.getAccHolderName());
	System.out.println("phno is: "+h.getPhNo());
	System.out.println("acc number is: "+h.getAccNo());
	System.out.println("adharnumber is: "+h.getAdharNo());
	System.out.println("data of birth: "+h.getDob());
	System.out.println("age is: "+h.getAge());
	}
	
	
	
	
	
}	
