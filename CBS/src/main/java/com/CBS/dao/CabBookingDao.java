package com.CBS.dao;

import java.util.List;

import com.CBS.model.Cab;
import com.CBS.model.Employee;

public interface CabBookingDao {

public boolean addCab(Cab cab);

public boolean addEmployee(Employee emp);

//public boolean bookaCab();
public List<Cab> viewCabs() ;

public List<Employee> viewEmployees();

}
