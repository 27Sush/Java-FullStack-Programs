package Pract;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EstablishConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		// 1. Load or Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Establish Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shambhu","root","root");
		
		// 3. Create statement
		Statement stm =	conn.createStatement();
		
		// 4. execute=Accepts all types of queries   exexucteUpdate()  select=> executeQuery()
		ResultSet rs = 	stm.executeQuery("select * from mydata");
		
		// 5. Close Connection
		conn.close();
	
	}

}
