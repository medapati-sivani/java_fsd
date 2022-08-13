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

import com.bean.Students;
import com.bean.Subjects;

/**
 * Servlet implementation class AssignTrainertoStudentController
 */
public class AssignTrainertoStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignTrainertoStudentController() {
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
		int sid = Integer.parseInt(request.getParameter("sid"));
		int tsid = Integer.parseInt(request.getParameter("tsid"));
		Students s=session.get(Students.class, sid);
		if(s==null)
		{
			out.println("Student Not Present");
		}
		else
		{
			tran.begin();
			s.setTsid(tsid);
			session.update(s);
			tran.commit();
			out.println("Assigned Trainer to Student Successfully");
		}
		 RequestDispatcher rd = request.getRequestDispatcher("assignTrainertoStudent.jsp");
	        rd.include(request, response);
	}

}
