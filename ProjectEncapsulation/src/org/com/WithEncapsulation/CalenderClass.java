package org.com.WithEncapsulation;

public class CalenderClass {
	private int monthNumber;
	public void assign(int monthNumber ) {
		if(monthNumber >=1 && monthNumber<=12) {
			this.monthNumber=monthNumber;
		}
		else {
			System.out.println("monthNumber is invalidNumber");
		}
	}
}
