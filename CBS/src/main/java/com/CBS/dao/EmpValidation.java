package com.CBS.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.CBS.dbutil.HybernateDbCon;
import com.CBS.model.Employee;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
public class EmpValidation {
	public static List<Employee> elist = null;
	public boolean check(Integer eId,String password) {
		boolean  st = false;
		Transaction tx =null;
		try {
			Session session = HybernateDbCon.getSessionFactory().openSession();
			tx = session.beginTransaction();
			SQLQuery q=session.createSQLQuery(" select * FROM employee e where e.eId= :eId and e.password= :password");
			q.setParameter("eId",eId);
			q.setParameter("password",password); 
			elist=q.list();
			for(int i=0;i<elist.size();i++){
			    System.out.println(elist.get(i));
			} 
			if(elist.size()==1) {
			st= true;
			}
			tx.commit();
			session.close();
		
		}
		catch(Exception e) {
			if (tx != null) {
                tx.rollback();
            }
			e.printStackTrace();
		}
		//System.out.println(st);
		return st;
	}
}