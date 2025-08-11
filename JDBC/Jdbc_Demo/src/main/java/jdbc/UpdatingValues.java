	package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatingValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		
		Statement st = con.createStatement();
		
		st.execute("update student set name='Sach' where id=2");
		System.out.println("Updatation done...");
		
		con.close();
	}

}
