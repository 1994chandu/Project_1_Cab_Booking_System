package com.CBS.test;

import com.CBS.dao.CabBookingDaoImpl;
import com.CBS.dao.EmpValidation;
import com.CBS.model.Employee;

import junit.framework.TestCase;

public class TestEmpValidation extends TestCase {

	/*protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}*/

	public void testCheck() {
		//fail("Not yet implemented");
		EmpValidation eval=new EmpValidation();
		assertEquals(true,eval.check(3, "chandrika"));
		/*Employee emp=new Employee(42,"resh","JFD","1234","989898998");
		CabBookingDaoImpl dao=new CabBookingDaoImpl();
		assertEquals(true,dao.addEmployee(emp));*/
	}

}
