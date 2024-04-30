package com.org.ExceptionHandlingPrograms;

import java.io.FileInputStream;
import java.io.IOException;

public class IoException {

	 public static void main(String[] args) {
		    try {
		      FileInputStream file = new FileInputStream("input.txt");
		      int content = file.read();
		      while (content != -1) {
		        System.out.print((char) content);
		        content = file.read();
		      }
		      file.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred: " + e.getMessage());
		    }
	 }
}
