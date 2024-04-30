package org.com.connectionEstablished;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Update {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3307/";
		String user="root";
		String password="mani@1234";
		
		String query="update vtalent.students set name='uma' where id=2";
		
		try {
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println("step:-connection done....");
			
			Statement statement = connection.createStatement();
			System.out.println("step:-statement is created....");
			
			int updatedRecords=statement.executeUpdate(query);
			System.out.println("step3:-update records are "+updatedRecords);
			
			if(updatedRecords>0) {
				System.out.println("no of records updated "+updatedRecords);
			}
			else {
				System.err.println("invalid information");
			}
			
			connection.close();
			System.out.println("connection close");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
