package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletingValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
		Statement stm = con.createStatement();
		
		int res = stm.executeUpdate("delete from pract where id=9");
		
		if(res!=0) {
			System.out.println("Deleted successfully...");
		} else {
			System.out.println("Failed...");
		}
		
		con.close();
	}

}
