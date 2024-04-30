package org.com.connectionEstablished;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DeleteRecords {
	public static void main(String[] args) throws IOException, SQLException {
		InputStream inputStream = new FileInputStream("sqlConnection.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		
		String db_url=properties.getProperty("url");
		String db_user=properties.getProperty("user");
		String db_password=properties.getProperty("password");
		
		String query="delete from vtalent.students where id=3";
		
		Connection connection = DriverManager.getConnection(db_url,db_user,db_password);
		System.out.println("step1:-connection done...");
		
		Statement statement = connection.createStatement();
		System.out.println("platform created....");
		
		int deleteRecord=statement.executeUpdate(query);
		System.out.println("query excuted....");
		if(deleteRecord>0) {
			System.out.println("total records deleted: "+deleteRecord);
		}
		else {
			System.out.println("invail information");
		}
		
		connection.close();
		System.out.println("connection close");
		
		
	}
}
