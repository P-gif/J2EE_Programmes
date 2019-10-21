package org.btm.uiApp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/fyroz")

public class FirstServlet1 extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resq) throws ServletException, IOException {
		
		String FirstName=req.getParameter("fs");
		String LastName=req.getParameter("ln");
		PrintWriter out=resq.getWriter();
		out.println("<html><body bgcolor='yellow'>"
				+ "<h1>hi hello"+FirstName+" "+LastName+" "+"</h1>"+"</body></html>");
		out.flush();
		out.close();
	}
 
}
