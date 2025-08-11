package programs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String info = req.getParameter("info");
		
		if(info.equals("sheela")) {
			resp.sendRedirect("index.html");
		} else if(info.equals("java")) {
			resp.sendRedirect("https://javatpoint.co.in/");
		} else {
			resp.sendRedirect("https://www.google.com/");
		}
	}
	
}
