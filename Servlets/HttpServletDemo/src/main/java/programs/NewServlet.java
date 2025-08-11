package programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/new")
public class NewServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String firstName = req.getParameter("fname");
		String lastName = req.getParameter("lname");
		
		PrintWriter pw = resp.getWriter();
		pw.println("First Name : "+firstName);
		pw.print("Last Name : "+lastName);

	}
	
}
