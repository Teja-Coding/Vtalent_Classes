package com.org.ExceptionHandlingPrograms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseExceptionExample {
	  public static void main(String[] args) throws ParseException {
		    String dateString = "2023-04-02";
		    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		
		      Date date = dateFormat.parse(dateString);
		      System.out.println(date);
	  }
}