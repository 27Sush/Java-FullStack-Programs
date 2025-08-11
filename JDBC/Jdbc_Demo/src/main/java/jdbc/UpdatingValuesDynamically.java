package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatingValuesDynamically {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		
		PreparedStatement ps = con.prepareStatement("update student set name=? where id=?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter student id : ");
		int id = sc.nextInt();
		
		ps.setString(1, name);
		ps.setInt(2, id);
		
		ps.executeUpdate();
		System.out.println("Updated...");
		
		con.close();
		
	}

}
