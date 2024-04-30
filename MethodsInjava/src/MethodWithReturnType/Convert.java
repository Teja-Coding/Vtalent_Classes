package MethodWithReturnType;

public class Convert {
	int hourToMin(int timeInHour) {
		return timeInHour*60;
	}
	public static void main(String[] args) {
		Convert c1 = new Convert();
		System.out.println(c1.hourToMin(5));
	}
}
