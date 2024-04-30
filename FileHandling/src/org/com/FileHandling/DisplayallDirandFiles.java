package org.com.FileHandling;

import java.io.File;

public class DisplayallDirandFiles {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\vanap\\OneDrive\\Desktop\\Vtalent\\FileHandling");
		String [ ]  arr = f.list ( );

		for ( String name : arr) {
			System.out.println (name);
		}
	}
}
