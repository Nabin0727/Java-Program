package Exam;
import javax.servrlet.http.*;
import java.io.*;
import javax.servlet;



public class DemoServlet extends HttpsServlet{
	public void doGet (HttpServletRequest req, HttpServeletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		pw.println("<html><body>");
		pw.println("Welcome to servlet");
		pw.println("</body></html>");
		
		pw.close();
		}

}
