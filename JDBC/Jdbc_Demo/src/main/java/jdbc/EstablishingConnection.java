package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishingConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		// Load or Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish Connection
		DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		System.out.println("Connection built....");
	}

}
