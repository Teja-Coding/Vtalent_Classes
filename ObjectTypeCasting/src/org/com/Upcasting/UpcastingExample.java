package org.com.Upcasting;


class A{
	public void wings() {
		System.out.println("using wings.......");
	}
}
class B extends A{
	public void weels() {
		System.out.println("using weels.......");
	}
}
public class UpcastingExample {
	public static void main(String[] args) {
		A a1=(A)new B();
		a1.wings();
		
		
		System.out.println("down casting.....");
		B b1=(B) a1;
		
		b1.wings();
		b1.weels();
		
	}
}
