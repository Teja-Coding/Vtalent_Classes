package MethodWithReturnType;

public class CalSpeed {
	static int givenDistance(int speed,int time) {
		return speed*time;
	}
	public static void main(String[] args) {
		int distance=givenDistance(150, 3);
		System.out.println("distance is "+distance);
	}
}
