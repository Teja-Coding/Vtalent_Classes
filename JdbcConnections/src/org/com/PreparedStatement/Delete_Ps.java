package org.com.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_Ps {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3307/";
		String user="root";
		String password="mani@1234";
		
		try {
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println("connection done");
			
			PreparedStatement ps = connection.prepareStatement("delete from vtalent.students where id=?");
			System.out.println("Preparedstatement created to carry the queray");
			
			//create the scanner class for run time values
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the id to delete the details: ");
			ps.setInt(1, scanner.nextInt());
			
			int recordDelete=ps.executeUpdate();
			System.out.println("records deleted : "+recordDelete);
			if(recordDelete>0) {
				System.out.println("no of records deleted: "+recordDelete);
			}
			else {
				System.out.println("invalid id.....");
			}
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
