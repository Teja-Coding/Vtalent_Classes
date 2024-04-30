package MethodWithReturnType;

public class FindAscii {
	int ascii(char a) {
		return a*1;
	}
	public static void main(String[] args) {
		FindAscii fa=new FindAscii();
		System.out.println(fa.ascii('b'));
	}
}
