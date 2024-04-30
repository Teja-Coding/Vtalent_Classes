package org.com.connectionEstablished;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*MYSQL_DB_URL=jdbc:mysql://localhost:3306/my_uat
MYSQL_DB_USER=root
MYSQL_DB_USER_PASSWORD=root123*/
public class EstablsehConnection {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3307/";
		String user="root";
		String password="mani@1234";
		
		Connection connection = DriverManager.getConnection(url,user,password); 
		System.out.println("connetion done");
	}
}
