package com.sam.BERI.fee.utility;

import java.sql.*;

public class Singleton {
	private  Connection con=null;
	private static final Singleton sig=new Singleton();

	private Singleton(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/feemanage?user=root&password=");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Singleton getSingleton(){
		return sig;
	}
	public  Connection getConnection(){
		return con;
	}
	@Override
	protected void finalize() throws Throwable 
	{
		if(con!=null)
		{
			con.close();
		}
	}
	
	
	
}

