package MethodWithReturnType;

public class Leapyear {
	String leapYear(int year) {
		 if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
	            return "leap year";
		 }
		 else {
			 return "not a leap year";
		 }
	}
	public static void main(String[] args) {
		Leapyear ly= new Leapyear();
		System.out.println(ly.leapYear(1999));
		
	}
}
