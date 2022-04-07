package com.CBS.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CBS.dao.Booking;
import com.CBS.dao.BookingImpl;
import com.CBS.dao.EmpValidation;
import com.CBS.model.BookingStatus;
import com.CBS.model.Request;
import com.CBS.service.CabBooking;
import com.CBS.service.CabBookingImpl;
/*
public class BookaCabServlet extends HttpServlet {
	
      	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			HttpSession s=request.getSession(true);
		    Integer eId = (Integer)s.getAttribute("eId");
			//out.println("requested");
			Booking b = new BookingImpl();
			boolean confirm = b.requestCab();
			out.println("requested");
			if(confirm) {
				out.println("<!DOCTYPE html>\r\n"
						+ "<html>\r\n"
						+ "\r\n"
						+ "<head>\r\n"
						+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"Cab.css\">  \r\n"
						+ "<meta charset=\"ISO-8859-1\">\r\n"
						+ "<title>Insert title here</title>\r\n"
						+ "</head>"
						+ "<body>\r\n"
						
						+ "        <form action = \"Login.html\" method=\"post\">\r\n"
						+ "            <button class=\"btns\" type=\"submit\">Logout</button>\r\n"
						+ "        </form>\r\n");
					
				out.println("Welcome to Cab booking <br>");
				out.println("Cab Requested successfully");
				
				}
			else {
				out.println("<!DOCTYPE html>\r\n"
						+ "<html>\r\n"
						+ "\r\n"
						+ "<head>\r\n"
						+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"Cab.css\">  \r\n"
						+ "<meta charset=\"ISO-8859-1\">\r\n"
						+ "<title>Insert title here</title>\r\n"
						+ "</head>"
						+ "\r\n"
						+ "<body>\r\n"
						+ "        <form action = \"logout\" method=\"post\">\r\n"
						+ "            <button class=\"btns\" type=\"submit\">Logout</button>\r\n"
						+ "        </form>\r\n");
					
				out.println("Welcome to Cab booking <br>");
				out.println("Couldn't Request your Cab</br>Your previous request is still pending. <br>Contact your Manager");
				
			} 
		}
	}*/
public class BookaCabServlet extends HttpServlet {

  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession sess = request.getSession(false);
		Integer EId = (Integer) sess.getAttribute("eId");
		
		String status ="Pending";
	//Timestamp rDate = new Timestamp(System.currentTimeMillis());
		//EmployeeInt reqCab = new EmployeeImpl();
		Booking b=new BookingImpl();
		Request req = new Request(status, EId);
		req.setStatus(status);
		req.setEmp(EmpValidation.elist.get(0));
		if(b.requestCab(req)) {
			out.println("Cab requested successfully!!");
		}
		else {
			out.println("Cab request failed!!");
		}

}
}

		

	


