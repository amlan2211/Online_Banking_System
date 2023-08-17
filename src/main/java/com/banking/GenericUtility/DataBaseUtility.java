package com.banking.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility 
{

	Connection con=null;
	public void connectToDB() throws SQLException
	{
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(IpathConstants.dbURL, IpathConstants.dbUsername,IpathConstants.dbPassword);
		
	}
	public String executequeryandGetdata(String query,int columnNo,String ExpData) throws SQLException
	{
		ResultSet result=con.createStatement().executeQuery(ExpData);
		boolean flag=false;
		while(result.next())
		{
			String data=result.getString(columnNo);
			if(data.equalsIgnoreCase(ExpData))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("data is verified");
			return ExpData;
		}
		else
		{
		System.out.println("data not verified");	
		return "";
		}
	}	
		public void closeDB() throws SQLException
		{
			con.close();
		}
		
	
	
}
