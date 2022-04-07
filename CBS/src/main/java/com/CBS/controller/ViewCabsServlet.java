package com.CBS.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CBS.model.Cab;
import com.CBS.service.CabBooking;
import com.CBS.service.CabBookingImpl;

public class ViewCabsServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		CabBooking cb=new CabBookingImpl();

		List<Cab> clist=cb.viewCabs();
		out.println("<html>\r\n"
				+ "<head>\r\n"
				+ "<style>\r\n"
				+ "table, th, td {\r\n"+"border-collapse: separate;\r\n"
						+ "  border-spacing: 2px;\r\n"
						+ "  border-color: gray;\r\n"
						+ ""
				+ "  border: 5px solid black;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "th, td {\r\n"
				+ "  padding: 10px;\r\n"
				+ "}\r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<table align=center style=\"background-color:#FFFFFF\">>\r\n"
				+ "  <tr>\r\n"
				+ "    <th>Cab number</th>\r\n"
				+ "    <th>Driver number</th>\r\n"
				+ "    <th>Booking status</th>\r\n"
				+ "    <th>Driver mobile</th>\r\n"
				+ "    <th>Route</th>\r\n"
				+ "  </tr>");
		for( Cab c:clist) {
			out.println( " <tr>\r\n"
					+ "    <td>"+c.getCabNo()+"</td>\r\n"
					+ "    <td>"+c.getDriverName()+"</td>\r\n"
					+ "    <td>"+c.getBookingStatus()+"</td>\r\n"
					+ "    <td>"+ c.getDmobile()+"</td>\r\n"
					+ "    <td>"+ c.getRoute()+"</td>\r\n"
					+ "  </tr>\r\n" );
			


							}
		out.println("</table>"
				+ "</html>");
	}

}