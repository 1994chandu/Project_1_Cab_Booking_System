package com.CBS.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.CBS.dbutil.HybernateDbCon;
import com.CBS.model.Cab;
import com.CBS.model.Employee;
import com.CBS.dbutil.HybernateDbCon;

public class CabBookingDaoImpl implements CabBookingDao {
	@Override
	public boolean addCab(Cab cab) {
		Session session=HybernateDbCon.getSessionFactory().openSession();
		Transaction tx= session.getTransaction();
		tx.begin();
		session.save(cab);
		tx.commit();
		session.close();
    	System.out.println(cab);
		System.out.println("Cab Added Successfully");
		return true;
	}
	@Override
	public boolean addEmployee(Employee emp) {
		Session session=HybernateDbCon.getSessionFactory().openSession();
		Transaction tx= session.getTransaction();
		tx.begin();
		session.save(emp);
		tx.commit();
		session.close();
		System.out.println(emp);
		System.out.println("Employee Added Successfully");
		return true;
	}
	
	@Override
	public List<Cab> viewCabs() {
		 SessionFactory factory = HybernateDbCon.getSessionFactory();
		  Session session = factory.openSession();
		  Query query = session.createQuery("FROM Cab");
		  @SuppressWarnings("unchecked")
		List<Cab> cab = query.list();
		  System.out.println(cab);
		return cab;
	}
	@Override
	public List<Employee> viewEmployees() {
		SessionFactory factory = HybernateDbCon.getSessionFactory();
		  Session session = factory.openSession();
		  Query query = session.createQuery("FROM Employee");
		  @SuppressWarnings("unchecked")
		List<Employee> emp = query.list();
		  System.out.println(emp);
		return emp;
	}
}
