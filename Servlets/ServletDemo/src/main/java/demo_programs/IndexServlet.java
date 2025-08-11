package demo_programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/hi")
public class IndexServlet extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Fetching data sent by client
		String name = arg0.getParameter("myname");
		
		//displaying data on the browser
		PrintWriter pw = arg1.getWriter();
		
		pw.println("WELCOME.............."+name);
		pw.write("This is my first webpage.");
		
	}

}
