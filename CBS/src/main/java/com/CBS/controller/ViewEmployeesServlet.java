package com.CBS.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CBS.model.Cab;
import com.CBS.model.Employee;
import com.CBS.service.CabBooking;
import com.CBS.service.CabBookingImpl;


public class ViewEmployeesServlet extends HttpServlet {
	
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			CabBooking cb=new CabBookingImpl();

			List<Employee> elist=cb.viewEmployees();
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
					+ "    <th>Employee Idr</th>\r\n"
					+ "    <th>Employee Name</th>\r\n"
					+ "    <th>Department Name</th>\r\n"
					+ "    <th>Password</th>\r\n"
					+ "    <th>Phone Number</th>\r\n"
					+ "  </tr>");
			for(Employee e:elist) {
				out.println( " <tr>\r\n"
						+ "    <td>"+e.getEId()+"</td>\r\n"
						+ "    <td>"+e.getEmpName()+"</td>\r\n"
						+ "    <td>"+e.getDeptName()+"</td>\r\n"
						+ "    <td>"+ e.getPassword()+"</td>\r\n"
						+ "    <td>"+ e.getPhno()+"</td>\r\n"
						+ "  </tr>\r\n"
						 );
			

		}
			out.println("</table>"
					+ "</html>");
		}
	}


