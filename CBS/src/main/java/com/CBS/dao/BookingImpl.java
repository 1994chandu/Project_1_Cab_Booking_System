package com.CBS.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.CBS.dbutil.HybernateDbCon;
import com.CBS.model.BookingStatus;
import com.CBS.model.Employee;
import com.CBS.model.Request;
public class BookingImpl implements Booking{
	public static List<Employee> elist =null;
	public boolean requestCab(Request req) {
		Session session = HybernateDbCon.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(req);
		if(tx!=null) {
			tx.commit();
		}
		else {
			tx.rollback();
		}
		session.close();
		return true;
	}
	

	/*@Override
	public boolean requestCab(Request request) {

		Session session = HybernateDbCon.getSessionFactory().openSession();
		Transaction tx=null;
		
		try {
			tx = session.beginTransaction();
			BookingStatus b = new BookingStatus(1,"Requested");
			for(Employee e : EmpValidation.elist) {
			
			Request rq = new Request(e,b);
			session.save(rq);
			}
			tx.commit();
			return true;
		} catch (HibernateException e) {
			if (tx != null) {
                tx.rollback();
            }
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}*/
	}


