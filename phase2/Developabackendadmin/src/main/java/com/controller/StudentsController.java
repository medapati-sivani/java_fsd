package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Students;
import com.service.StudentsService;

/**
 * Servlet implementation class StudentsController
 */
public class StudentsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		StudentsService ss = new StudentsService();
		List<Students> listofStudents=ss.findAllStudents();
		HttpSession hs=request.getSession();
		hs.setAttribute("listofStudents", listofStudents);
		response.setContentType("text/html");
		response.sendRedirect("viewstudent.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
        int sid = Integer.parseInt(request.getParameter("sid"));
        String sname = request.getParameter("sname");
        int age = Integer.parseInt(request.getParameter("age"));
        Students s = new Students();
        s.setSid(sid);
        s.setSname(sname);
        s.setAge(age);
        StudentsService ss = new StudentsService();
        String result = ss.storeStudents(s);
        pw.print(result);
        RequestDispatcher rd = request.getRequestDispatcher("storestudent.jsp");
        rd.include(request, response);
	}

}
