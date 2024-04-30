package org.com.FileHandling;

import java.io.File;

public class Demo2 {
	public static void main(String[] args) {
		File f1=new File("C:\\Users\\vanap\\OneDrive\\Desktop\\Vtalent\\FileHandling");
		String [] arr = f1.list();
		for(String name:arr) {
			File f2=new File(f1,name);
			if(f2.isFile()) {
				System.out.println("file name:"+name);
			}
			if(f2.isDirectory()) {
				System.out.println("Directory name: "+name);
			}
			
		}
	}
}