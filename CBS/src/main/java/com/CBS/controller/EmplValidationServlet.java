package com.CBS.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.CBS.model.Employee;

import com.CBS.dao.EmpValidation;
public class EmplValidationServlet extends HttpServlet {
	private static final Logger logger = Logger.getLogger("Employee.class");

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Integer eId =Integer.parseInt(request.getParameter("eId"));
		String password =request.getParameter("password");
		HttpSession s=request.getSession(true);
		s.setAttribute("eId", eId);
		s.setAttribute("password", password);
		EmpValidation eval=new EmpValidation();
		//boolean result=eval.check(empName,password);
		/*if(result) {
			RequestDispatcher rd=request.getRequestDispatcher("EmpDutiesServlet");
			rd.include(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("Unuccess");
			rd.include(request, response);
		}*/logger.info("Employee Validation");
			if(eval.check(eId,password))
			{
				out.println("<h1 align=center> Employee Logged in successfully</h1>");
				out.println("<!DOCTYPE html>\r\n"
						+ "<html>\r\n"
						+ "<head>\r\n"
						+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"Cab.css\">  \r\n"
						+ "<meta charset=\"ISO-8859-1\">\r\n"
						+ "<title>Employee Duties</title>\r\n"
						+ "</head>\r\n"
						+ "\r\n"
						+ "<body bgcolor=CadetBlue >\r\n"
						+ "<div id =\"main\" style=\"text-align:center; padding:25px;background-color: lightblue;\">\r\n"
						+ "<h1 align=\"center\" style=\"margin-top:5%;\">Welcome Employee</h1>\r\n"
						+ "</div>\r\n"
						+ "<div align=right background-color:tomato;>\r\n"
						+ "<a href=\"Login.html\">Logout</a>\r\n"
						+ "</div> \r\n"
						+ "<div align=center>\r\n"
						+ "<form action=BookaCabServlet method=\"post\">\r\n"
						+ "<table>\r\n"
						+ " <tr><td align=center>  <input type=submit value=\"Request a Cab\" >  </td>\r\n"
						+ " </tr>\r\n"
						+ " </table>\r\n"
						+ " </form>\r\n"
						+ " <form action=ViewCabsServlet method=\"post\">\r\n"
						+ " <table>\r\n"
						+ " <tr> <td align=center> <input type=submit value=\"View all Cabs\" ></td>  \r\n"
						+ " </tr>\r\n"
						+ "  </table> \r\n"
						+ "    </form> \r\n"
						+ "    </div>            \r\n"
						+ "</body>\r\n"
						+ "</html>");
				
				

			}
			else
			{
				out.println("<h1 align=center margin-top:2%> Invalid empNmae or password. Please enter valid details </h1>");
	
			}
		}
}



