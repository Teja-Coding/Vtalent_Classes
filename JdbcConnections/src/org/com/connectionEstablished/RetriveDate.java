package org.com.connectionEstablished;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveDate {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3307/";
		String user="root";
		String password="mani@1234";
		
		String query="select * from vtalent.students where id=2 ";
		
		try {
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println("connection done");
			
			Statement statement = connection.createStatement();
			System.out.println("plateform created...");
			
			ResultSet rs=statement.executeQuery(query);
			System.out.println("query will by executed...");
			
			boolean status = rs.next();
			if(status) {
				System.out.println("details of the students");
				System.out.println("-----------------------------");
				int id=rs.getInt("id");
				System.out.println("student id : "+id);
				String name=rs.getString("name");
				System.out.println("student name : "+name);
				String phone=rs.getString("phone");
				System.out.println("studnet phone number: "+phone);			
				System.out.println("------------------------------");
				
			}
			else {
				System.out.println("given id is invalid...");
			}
			connection.close();
			System.out.println("connection close...");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
