package org.com.connectionEstablished;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class InsertRecords {
	public static void main(String[] args) throws IOException, SQLException {
		 InputStream inputStream = new FileInputStream("sqlConnection.properties");
		 Properties properties = new Properties();
		 
		 properties.load(inputStream);
		 
		 String db_url=properties.getProperty("url");
		 String db_user=properties.getProperty("user");
		 String db_password= properties.getProperty("password");
		 
		 String q1="insert into vtalent.students value(3,'sai',9494013928)";
		 
		 Connection connection = DriverManager.getConnection(db_url,db_user,db_password);
		 System.out.println("step1:-connection done");
		 
		 Statement statement = connection.createStatement();
		 System.out.println("platform created....");
		 
	     int insertRecords=statement.executeUpdate(q1);
		 System.out.println("query executed");
		 
		 if(insertRecords>0) {
			 System.out.println("no of records inserted:"+insertRecords);
		 }
		 
		 connection.close();
		 System.out.println("connection close");
		 
	}
}
