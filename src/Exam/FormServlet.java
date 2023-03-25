package Exam;
import javax.servrlet.http.*;
import java.io.*;
import javax.servlet;

public class FormServlet extends HttpServlet {
	public void doPost (HttpServletRequest req, HttpServletResponse res)throws ServeletException, IOException{
		//get the requeest parameter
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		//set the response content type 
		res.setContentType("text/html");
		
		//get output stream for writing
		PrintWriter pw = res.getWriter();
		//Print resopnse
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<tittle>Form Servlet</tittle>");
		
		pw.println("</head>");
		pw.println("<h1>Form Servlet</h1>");
		pw.println("<p>Username:" + username + "</p>");
		
		pw.println("<p>Password" + password + "</p>");
		pw.println("</body>");
		pw.println("</html>");
		
		
	}

}
