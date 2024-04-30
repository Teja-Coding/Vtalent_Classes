package com.org.ExceptionHandlingPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionExample {
	  public static void main(String[] args) {
		    Connection conn = null;
		    Statement stmt = null;

		    try {
		      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
		      stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
		      while (rs.next()) {
		        int id = rs.getInt("id");
		        String name = rs.getString("name");
		        System.out.println("ID: " + id + ", Name: " + name);
		      }
		    } catch (SQLException e) {
		      System.out.println("An error occurred: " + e.getMessage());
		    } finally {
		      try {
		        if (stmt != null) {
		          stmt.close();
		        }
		        if (conn != null) {
		          conn.close();
		        }
		      } catch (SQLException ex) {
		        System.out.println("An error occurred while closing the connection: " + ex.getMessage());
		      }
		    }
	  }
}