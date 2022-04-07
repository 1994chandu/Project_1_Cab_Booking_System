package com.CBS.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CBS.dao.BookingHisttory;
import com.CBS.model.BookingDetails;
import com.CBS.model.Employee;
import com.CBS.service.CabBooking;
import com.CBS.service.CabBookingImpl;


public class BookingHistoryServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession s=request.getSession(true);
		BookingHisttory bk=new BookingHisttory();
			List<BookingDetails> elist=bk.disp();
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
					+ "    <th>BIdr</th>\r\n"
					+ "    <th>CabNo</th>\r\n"
					+ "    <th>EId</th>\r\n"
					+ "  </tr>");
			for(BookingDetails e:elist) {
				out.println( " <tr>\r\n"
						+ "    <td>"+e.getBookingId()+"</td>\r\n"
						+ "    <td>"+e.getCabNo()+"</td>\r\n"
						+ "    <td>"+e.getEId()+"</td>\r\n"
						+ "  </tr>\r\n");
			

		}
			out.println("</table>"
					+ "</html>");
		}
	}
	


