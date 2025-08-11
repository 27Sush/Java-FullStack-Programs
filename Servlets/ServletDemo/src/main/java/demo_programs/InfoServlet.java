package demo_programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/info")
public class InfoServlet extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = arg0.getParameter("myname");
		String dob = arg0.getParameter("dob");
		String phone = arg0.getParameter("phoneNumber");
		String address = arg0.getParameter("address");
		String email = arg0.getParameter("emailID");
		
		PrintWriter pw = arg1.getWriter();
		
		pw.println("My info.....");
		pw.println("My name is : " + name);
		pw.println("Date of birth : " + dob);
		pw.println("Phone number : " + phone);
		pw.println("Address : " + address);
		pw.println("Email ID : "+email);
		
	}
}
