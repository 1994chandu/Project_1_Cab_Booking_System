package com.CBS.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmpDutiesServlet extends HttpServlet {

			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"Cab.css\">  \r\n"
					+ "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<title>Insert title here</title>\r\n"
					+ "</head>\r\n"
					+ "\r\n"
					+ "<body bgcolor=CadetBlue >\r\n"
					+ "<div id =\"main\" style=\"text-align:center; padding:25px;background-color: lightblue;\">\r\n"
					+ "<h1 align=\"center\" style=\"margin-top:2%;\">Welcome Employee</h1>\r\n"
					+ "</div>\r\n"
					+ "<div align=right background-color:tomato;>\r\n"
					+ "<a href=\"Login.html\">Logout</a>\r\n"
					+ "</div> \r\n"
					+ "<div>\r\n"
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

}
