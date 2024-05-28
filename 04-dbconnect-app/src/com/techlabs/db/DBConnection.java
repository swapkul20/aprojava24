package com.techlabs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public void connect() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
		   System.out.println("Connection Successfull");
		   Statement statement=connection.createStatement();
		   ResultSet result=statement.executeQuery("select * from student");
		   while(result.next())
		   {
			   System.out.println(result.getInt("rollnumber")+"\t"+result.getString(2)+"\t");
		   }
		   connection.close();
		   
		} catch (ClassNotFoundException e) {
			
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
