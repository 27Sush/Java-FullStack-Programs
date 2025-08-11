package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDynamically {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		
		PreparedStatement ps = con.prepareStatement("delete from pract where name=?");
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Name : ");
		String name = sc.nextLine();
		
		ps.setString(1, name);
		
		int rs = ps.executeUpdate();
		if(rs>0) {
			System.out.println("Done");
		} else {
			System.out.println("Failed");
		}
		
		con.close();
	}

}
