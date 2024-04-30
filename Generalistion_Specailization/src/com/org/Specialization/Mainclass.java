package com.org.Specialization;

public class Mainclass {
	public static void activity(SpecializationDemo s) {
		s.read();
		s.write();
		s.test();
	}
	public static void main(String[] args) {
		activity(new SpecializationDemo("yuva"));
		activity(new SpecializationDemo("mani"));
		activity(new SpecializationDemo("sri "));
	}
}
