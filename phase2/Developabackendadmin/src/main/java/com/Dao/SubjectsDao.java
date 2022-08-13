package com.Dao;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bean.Subjects;
public class SubjectsDao 
{
	 public int storeSubjects(Subjects subjects) 
	 {
	        try 
	        {
	        	Configuration con = new Configuration();
	        	con.configure("hibernate.cfg.xml");
	        	SessionFactory sf = con.buildSessionFactory();
	        	Session session = sf.openSession();
	            Transaction tran = session.getTransaction();
	            tran.begin();
	            session.save(subjects);
	            tran.commit();
	            return 1;
	        } 
	        catch (Exception e) 
	        {
	            System.out.println(e);
	            return 0;
	        }
	 }
	 public List<Subjects> findAllSubjects() 
	 {
		 Configuration con = new Configuration();
     	con.configure("hibernate.cfg.xml");
     	SessionFactory sf = con.buildSessionFactory();
     	Session session = sf.openSession();
	        TypedQuery qry = session.createQuery("select s from Subjects s");
	        List<Subjects> listofSubjects = qry.getResultList();
	        return listofSubjects;
	    }
}
