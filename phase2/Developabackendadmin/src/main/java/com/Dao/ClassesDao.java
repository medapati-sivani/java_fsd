package com.Dao;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bean.Classes;
public class ClassesDao 
{
	 public int storeClasses(Classes classes) 
	 {
	        try 
	        {
	            Configuration con = new Configuration();
	            con.configure("hibernate.cfg.xml");
	            SessionFactory sf = con.buildSessionFactory();
	            Session session = sf.openSession();
	            Transaction tran = session.getTransaction();
	            tran.begin();
	            session.save(classes);
	            tran.commit();
	            return 1;
	        } 
	        catch (Exception e) 
	        {
	            System.out.println(e);
	            return 0;
	        }
	 }
	 public List<Classes> findAllClasses() 
	 {
	        Configuration con = new Configuration();
	        con.configure("hibernate.cfg.xml");
	        SessionFactory sf = con.buildSessionFactory();
	        Session session = sf.openSession();
	        TypedQuery qry = session.createQuery("select s from Classes s");
	        List<Classes> listofClasses = qry.getResultList();
	        return listofClasses;
	    }
}
