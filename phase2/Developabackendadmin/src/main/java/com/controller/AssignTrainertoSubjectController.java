package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Subjects;

/**
 * Servlet implementation class AssignTrainertoSubjectController
 */
public class AssignTrainertoSubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignTrainertoSubjectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		int subid = Integer.parseInt(request.getParameter("subid"));
		int tsubid = Integer.parseInt(request.getParameter("tsubid"));
		Subjects s=session.get(Subjects.class, subid);
		if(s==null)
		{
			out.println("Subject Not Present");
		}
		else
		{
			tran.begin();
			s.setTsubid(tsubid);
			session.update(s);
			tran.commit();
			out.println("Assigned Trainer to Subject Successfully");
		}
		RequestDispatcher rd = request.getRequestDispatcher("assignTrainertoSubject.jsp");
        rd.include(request, response);
	}

}
