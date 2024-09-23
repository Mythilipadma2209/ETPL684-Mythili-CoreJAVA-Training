package com.evregent.CoreJAVA.Studentapplication.JDBC;
import java.sql.*;

public class StudentDB 
{
	 public static Connection getConnection() throws Exception
	  {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				  "jdbc:mysql://localhost:3306/evergentdb",
				  "root",
				  "admin"); 
		return conn;
	  }

}
