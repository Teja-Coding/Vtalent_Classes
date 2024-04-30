package org.com.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RetriveDate_ps {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3307/";
		String user="root";
		String password="mani@1234";
		
		String query="select * from vtalent.students where id=? ";
		
		Connection connection = DriverManager.getConnection(url,user,password);
		System.out.println("connection done....");
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		System.out.println("preparedStatement is ready to carring the query...");
		
		//take the input from user
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the id: ");
		
		preparedStatement.setInt(1,scanner.nextInt());
		
		ResultSet rs=preparedStatement.executeQuery();
		
		boolean status=rs.next();
		if(status) {
			System.out.println("------------------------------------");
			System.out.println("student id:"+rs.getInt("id"));
			System.out.println("student name:"+rs.getString("name"));
			System.out.println("student phone:"+rs.getString("phone"));
			System.out.println("------------------------------------");
		}
		else {
			System.err.println("no records found....");
		}
		connection.close();
		System.out.println("connection close...");
	}
}
