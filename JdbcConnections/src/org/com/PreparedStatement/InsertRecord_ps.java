package org.com.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecord_ps {
	public static void main(String[] args) {
	
	String url="jdbc:mysql://localhost:3307/";
	String user="root";	
	String password="mani@1234";
	
	String quary="insert into vtalent.students value (?,?,?)";
	
	try {
		Connection connection = DriverManager.getConnection(url,user,password);
		System.out.println("connection done....");
		PreparedStatement preparedStatement = connection.prepareStatement(quary);
		System.out.println("prepared statement carring the query...");
		
		//create a scanner class to take run time values...
		Scanner scanner = new Scanner( System.in);
		System.out.println("enter the student id: ");
		preparedStatement.setInt(1, scanner.nextInt());
		
		System.out.println("enter the studnet name: ");
		preparedStatement.setString(2, scanner.next());
		
		System.out.println("enter the phone number: ");
		preparedStatement.setString(3, scanner.next());
		
		int insertRecord=preparedStatement.executeUpdate();
		if(insertRecord>0) {
			System.out.println("no of record inserted: "+insertRecord);
		}
		else {
			System.out.println("enter reapeted id ");
		}
		connection.close();
		System.out.println("connectin close....");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}