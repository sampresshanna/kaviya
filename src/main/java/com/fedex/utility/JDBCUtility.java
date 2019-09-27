package com.fedex.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class JDBCUtility {

	private static String filePath="//tmp//";
	private static String environment="L1";
	
	public static Connection getConnection()
	{
		Connection conn=null;
		String url=null;
		String user=null;
		String password=null;
		try {
			Properties prop=new Properties();
			
//			//prop.load((new ClassPathResource("application.properties").getInputStream()) );
//			if(environment.equalsIgnoreCase("L1"))
//			{
//				prop.load(new FileInputStream(new File(filePath+"\\L1\\application.properties")) );
//			}else if(environment.equalsIgnoreCase("L2"))
//			{
//				prop.load(new FileInputStream(new File(filePath+"\\L2\\application.properties")) );
//			}
			//System.out.println("ENV_DIR TEXT=========>"+"tmp");
			
			
			System.out.println("From System ENV_DIR TEXT=========>"+System.getProperty("tmp"));
			
			System.out.println("Full TEXT=========>"+filePath+"application.properties");
				
			prop.load(new FileInputStream(new File(filePath+"application.properties")));
			
			url=prop.getProperty("spring.datasource.url");
			user=prop.getProperty("spring.datasource.username");
			password=prop.getProperty("spring.datasource.password");
			conn=DriverManager.getConnection(url, user, password);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	
}
