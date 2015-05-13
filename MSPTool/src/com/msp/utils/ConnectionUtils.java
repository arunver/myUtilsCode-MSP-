package com.msp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Arun.Verma
 *
 */

public class ConnectionUtils {
	
	private static ConnectionUtils connectionUtils= new ConnectionUtils();
	private Connection connection=null;
	
	private ConnectionUtils()
	{
		try
		{
			Class.forName(PropertiesInfo.getInstance().getPropertyValue("driver"));
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			connection= DriverManager.getConnection(PropertiesInfo.getInstance().getPropertyValue("host")+""+PropertiesInfo.getInstance().getPropertyValue("port")+"/"+PropertiesInfo.getInstance().getPropertyValue("database"), PropertiesInfo.getInstance().getPropertyValue("userName"), PropertiesInfo.getInstance().getPropertyValue("password"));
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static ConnectionUtils getInstance()
	{
		if(connectionUtils==null)
		{
			connectionUtils= new ConnectionUtils();
		}
		
		return connectionUtils;
	}
	
	public Connection getConnection()
	{
		
		return this.connection;
	}

}
