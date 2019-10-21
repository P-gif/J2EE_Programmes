package org.btm.UiApp;
import java.io.*;
import javax.servlet.*;


public class FirstServlet extends GenericServlet
{
	@Override
 public void service(ServletRequest req ,ServletResponse resq) throws ServletException,IOException
 {
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		PrintWriter out=resq.getWriter();
		out.println("<html><body bgcolor='yellow'>"
				+ "<h1> hi frnds how are you alll....."+name+" "+place+" "+"</h1>"+"</body></html>");
		out.flush();
		out.close();
		
 }
}
