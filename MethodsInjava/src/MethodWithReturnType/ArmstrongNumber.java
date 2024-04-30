package MethodWithReturnType;

import java.util.Scanner;

public class ArmstrongNumber {
	int input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is Armstrong");
		return sc.nextInt();
	}

	int condition(int num) {

		int total = 0;
		int lastNum = 0;
		while (num > 0) {
			lastNum = num % 10;
			num = num / 10;
			total = total + lastNum * lastNum * lastNum;
		}
		return total;
	}

	public static void main(String[] args) {
		ArmstrongNumber asn = new ArmstrongNumber();
		int num = asn.input();
		int total = asn.condition(num);
		int original = num;
		if (original == total) {
			System.out.println("The number is Armstrong");
		} else {
			System.out.println("The number is not Armstrong");
		}
	}
}
