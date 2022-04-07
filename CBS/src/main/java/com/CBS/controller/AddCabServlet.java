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
import com.CBS.model.Cab;
import com.CBS.service.CabBooking;
import com.CBS.service.CabBookingImpl;

public class AddCabServlet extends HttpServlet {
	private static final Logger logger = Logger.getLogger("Admin.class");

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Integer cabNo =Integer.parseInt(request.getParameter("cabNo"));
		String driverName =request.getParameter("driverName");
		String route =request.getParameter("route");
		String time =request.getParameter("time");
		String	bookingStatus =request.getParameter("bookingStatus");
		String dmobile =request.getParameter("dmobile");
		Cab cab=new Cab(cabNo,driverName,route,time,bookingStatus,dmobile);
		HttpSession s=request.getSession(true);
		s.setAttribute("cab", cab);
		CabBooking cb=new CabBookingImpl();
		boolean result=cb.addCab(cab);
		if(result) {
			RequestDispatcher rd=request.getRequestDispatcher("Success");
			rd.include(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("Unuccess");
			rd.include(request, response);
		}
	}
}
