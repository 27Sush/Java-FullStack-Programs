package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletingValuesDynamically {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		
		PreparedStatement ps = con.prepareStatement("delete from student where name=?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name : ");
		String name = sc.nextLine();
		
		ps.setString(1, name);
		
		ps.executeUpdate();
		System.out.println("Deleted...");
		
		con.close();
	}

}
