package com.ahmet.jdbc;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcUrl="jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
		String user="hibstudent";
		String pass="hibstudent";
		
		try {
			System.out.println("Connecting to database:" + jdbcUrl);
			Connection myConn=
					(Connection) DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection successful");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
