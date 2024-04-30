package com.org.ExceptionHandlingPrograms;

import java.lang.reflect.Method;

public class NoSuchMethodExceptionExample {
	
	  public static void main(String[] args) {
		    try {
		      Class<?> clazz = Class.forName("java.util.ArrayList");
		      Method method = clazz.getMethod("nonExistentMethod");
		    } catch (NoSuchMethodException | ClassNotFoundException e) {
		      System.out.println("An error occurred: " + e.getMessage());
		    }
		  }
		}