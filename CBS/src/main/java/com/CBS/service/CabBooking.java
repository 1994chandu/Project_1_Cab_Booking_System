package com.CBS.service;

import java.util.List;

import com.CBS.model.Cab;
import com.CBS.model.Employee;
import com.CBS.model.Request;

public interface CabBooking {
	public boolean addCab(Cab cab);
	public boolean addEmployee(Employee emp);
	public boolean requestCab(Request request);
	public List<Cab> viewCabs() ;
	public List<Employee> viewEmployees();
}
