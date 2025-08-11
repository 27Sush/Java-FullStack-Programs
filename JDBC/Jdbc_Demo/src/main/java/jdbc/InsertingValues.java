package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		
		Statement st = con.createStatement();
		
		st.execute("insert into student values(1,'Sushant',24)");
		st.execute("insert into student values(2,'Sachin',23)");
		st.execute("insert into student values(3,'Saad',23)");
		
		System.out.println("Data inserted successfully...");
		
		con.close();
	}

}
