package com.CBS.service;
import java.util.List;

import com.CBS.dao.Booking;
import com.CBS.dao.BookingImpl;
import com.CBS.dao.CabBookingDao;
import com.CBS.dao.CabBookingDaoImpl;
import com.CBS.model.Cab;
import com.CBS.model.Employee;
import com.CBS.model.Request;
public class CabBookingImpl implements CabBooking{
	CabBookingDao dao=new CabBookingDaoImpl();
	@Override
	public boolean addCab(Cab cab) {
		dao.addCab(cab);
		
		return true;
	}

	@Override
	public boolean addEmployee(Employee emp) {
		dao.addEmployee(emp);
	
		return true;
	}

	@Override
	public boolean requestCab(Request request) {
		Booking b=new BookingImpl();
		b.requestCab(request);
		return true;
	}
	
	public List<Cab> viewCabs() {
		return dao.viewCabs();
	}

	//@Override
	public List<Employee> viewEmployees() {
		return dao.viewEmployees();
	}

}
