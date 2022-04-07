package com.CBS.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.CBS.dbutil.HybernateDbCon;
import com.CBS.model.BookingDetails;
import com.CBS.model.Cab;
import com.CBS.model.Employee;

public class BookingHisttory {
	public static List<Employee> elist = null;
	public List<BookingDetails> disp() {
	SessionFactory factory = HybernateDbCon.getSessionFactory();
	  Session session = factory.openSession();
	  Query query = session.createQuery("FROM bdetails");
	  @SuppressWarnings("unchecked")
	List<BookingDetails> bd = query.list();
	  System.out.println(bd);
	return bd;
}

}
