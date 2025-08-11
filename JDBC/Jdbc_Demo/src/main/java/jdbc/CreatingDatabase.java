package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
		// Load or Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		
		// Create Statement
		Statement st = con.createStatement();
		
		st.execute("create database school");
		// Process the result if any... 
		
		con.close(); //It clears the obj memory
		
	}

}
