package org.com.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update_Ps {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3307/";
		String user="root";	
		String password="mani@1234";
		
		String query="update vtalent.students set name=? where id=?";
		
		try {
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println("connectin done.....");
			
			PreparedStatement ps = connection.prepareStatement(query);
			System.out.println("preparedStatement created to carrying the query....");
			
			//taking the values form user with help of the scanner class
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the new name: ");
			//assign values for the place holder
			ps.setString(1, scanner.nextLine());
			
			System.out.println("to change the name enter the id: ");
			ps.setInt(2, scanner.nextInt());
			
			int recordUpdeted = ps.executeUpdate();
			System.out.println("records is updated: "+ recordUpdeted);
			if(recordUpdeted>0) {
				System.out.println("no of records updated in table: "+recordUpdeted);
			}
			else {
				System.out.println("enter id is invalid...");
			}
			
			connection.close();
			System.out.println("connecition close....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
