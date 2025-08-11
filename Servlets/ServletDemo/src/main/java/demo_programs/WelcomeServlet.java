package demo_programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/welcome")
public class WelcomeServlet extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = arg0.getParameter("uname");
		
		PrintWriter pw = arg1.getWriter();
		pw.print("<h1>WELCOME..." + username+"</h1>");
		pw.print("<br></h1>You have successfully logged in...</h1>");
		pw.print("<h1>Hey there this is just plain text</h1>");
		
		
	}

}
