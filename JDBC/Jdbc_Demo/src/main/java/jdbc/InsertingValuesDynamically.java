package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertingValuesDynamically {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		
		// 3. Create statement using PreparedStatement interface
			// 3.1 Create dynamic SQL query using placeholder
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
		
			// 3.2 Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter student name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter student age : ");
		int age = sc.nextInt();
		
			// 3.3 Set the user entered values in placeholder
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		
		// Execute query
		ps.executeUpdate();
		System.out.println("Query Executed...");
		
		con.close();
		
	}

}
