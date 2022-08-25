package com.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Feedback;

@Repository
public class FeedbackDao {
@Autowired
EntityManagerFactory emf;                          // it will do di for applicaton.properties	

public int storeFeedback(Feedback fb) {
	try {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
			manager.persist(fb);							// session.save(emp)
		tran.commit();
		return 1;
	} catch (Exception e) {
	System.out.println(e);
	return 0;
	}
}

public List<Feedback> getAllFeedbackDetails() {
	EntityManager manger = emf.createEntityManager();
	Query qry = manger.createQuery("select e from Feedback e");  			// JPQL 
	List<Feedback> listOfEmp = qry.getResultList();
	return listOfEmp;
}

}
