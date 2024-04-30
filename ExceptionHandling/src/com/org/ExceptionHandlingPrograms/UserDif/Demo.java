package com.org.ExceptionHandlingPrograms.UserDif;

public class Demo {
	private String getName(int id) {
		if (id == 100) {
			return "Raju";
		} else if (id == 101) {
			return "Rani";
		} else {
			throw new NoDataFoundException("Invalid Id");
		}
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.getName(200);
	}
}

