package com.banking.obs.pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NoSelectQuery {

	public static void main(String[] args) throws SQLException 
	{
		    Connection con=null;
		     int result=0;
		    try 
		    {
			Driver driver= new Driver();
			DriverManager.registerDriver(driver);
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/obs","root", "root");
			Statement state=con.createStatement();
			String query = "insert into rmg4 values(3,'krishna','jp nagar'),(4,'kant','mahakavi');";
			 result = state.executeUpdate(query);
			
		    }
			catch (Exception e) 
		    {
				
			}
		    finally {
		    	if(result>0)
		    	{
		    		System.out.println("data updated success");
		    	}
		    	else
		    	{
		    		System.err.println("data not inserted");
		    	}
				con.close();
			}
		
	}

}
