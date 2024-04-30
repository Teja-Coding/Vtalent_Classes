package org.com.connectionEstablished;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class PropertiesFile {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = new FileInputStream("sqlConnection.properties");
		
		Properties properties = new Properties();
		properties.load(inputStream);
		
		String db_url=properties.getProperty("url");
		String db_user=properties.getProperty("user");
		String db_password=properties.getProperty("password");
		
		String query="update vtalent.students set name='dharani' where id=2";
		
		try {
			Connection connection = DriverManager.getConnection(db_url,db_user,db_password);
			System.out.println("step1:- connection done...");
			
			Statement statement = connection.createStatement();
			System.out.println("step2:-statement created...");
			
			int updateRecord=statement.executeUpdate(query);
			System.out.println("updated records are:"+ updateRecord);
			
			if(updateRecord>0) {
				System.out.println("no of records updated: "+updateRecord);
			}
			else
			{
				System.out.println("invalid information");
			}
			
			connection.close();
			System.out.println("connection close...");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
