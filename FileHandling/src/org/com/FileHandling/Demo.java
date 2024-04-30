package org.com.FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		File f1=new File("vtalent.txt");
		boolean status=f1.createNewFile();
		System.out.println("file created "+status);
		
		File f2=new File("vtalent");
		boolean dic=f2.mkdir();
		System.out.println(dic);
		
		File f3=new File(f2,"name.txt");
		boolean create=f3.createNewFile();
		System.out.println(create);
		
		
	}
}
