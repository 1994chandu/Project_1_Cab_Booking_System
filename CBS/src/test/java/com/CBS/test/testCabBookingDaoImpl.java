package com.CBS.test;

import com.CBS.dao.CabBookingDaoImpl;
import com.CBS.model.Cab;
import com.CBS.model.Employee;

import junit.framework.TestCase;

public class testCabBookingDaoImpl extends TestCase {

/*	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
*/
	public void testAddCab() {
		Cab cab=new Cab(402344,"sui","suchitra","23:00","free","989898998");
		CabBookingDaoImpl dao=new CabBookingDaoImpl();
		assertEquals(true,dao.addCab(cab));
	}

	public void testAddEmployee() {
		Employee emp=new Employee(402,"rsh","JFD","1234","989898998");
		CabBookingDaoImpl dao=new CabBookingDaoImpl();
		assertEquals(true,dao.addEmployee(emp));
	}

}
