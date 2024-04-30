package com.org.StudentArrayList;

public class StudentArrayList {
	int id;
	String name;

	public StudentArrayList(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " - " + name;
	}
}
