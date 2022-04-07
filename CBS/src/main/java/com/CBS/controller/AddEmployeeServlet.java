package com.CBS.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CBS.model.Cab;
import com.CBS.model.Employee;
import com.CBS.service.CabBooking;
import com.CBS.service.CabBookingImpl;

public class AddEmployeeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	Integer eId =Integer.parseInt(request.getParameter("eId"));
	String empName =request.getParameter("empName");
	String deptName =request.getParameter("deptName");
	String password =request.getParameter("password");
	String	phno =request.getParameter("phno");
	Employee emp=new Employee(eId,empName,deptName,password,phno);
	HttpSession s=request.getSession(true);
	s.setAttribute("emp", emp);
	CabBooking cb=new CabBookingImpl();
	boolean result=cb.addEmployee(emp);
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
