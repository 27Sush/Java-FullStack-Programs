package demo_programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = arg0.getParameter("uname");
		String password = arg0.getParameter("password");
		
		if(username.equals("sush") && password.equals("12345")) {
			
			// forward req sent by client to another servlet
			RequestDispatcher rd = arg0.getRequestDispatcher("welcome");
			rd.forward(arg0, arg1);
			
		} else {
    
			arg1.setContentType("text/html");
			
			PrintWriter pw = arg1.getWriter();
			pw.println("Incorrect username and password...");
			
			RequestDispatcher rd = arg0.getRequestDispatcher("login.html");
			rd.include(arg0, arg1);
			
		}
		
	}

}
