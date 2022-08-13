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


import com.bean.Subjects;

import com.service.SubjectsService;

/**
 * Servlet implementation class SubjectsController
 */
public class SubjectsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		SubjectsService ss=new SubjectsService();
		List<Subjects> listofSubjects=ss.findAllSubjects();
		HttpSession hs=request.getSession();
		hs.setAttribute("listofSubjects", listofSubjects);
		response.setContentType("text/html");
		response.sendRedirect("viewsubject.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
        int subid = Integer.parseInt(request.getParameter("subid"));
        String subname = request.getParameter("subname");
        Subjects s = new Subjects();
        s.setSubid(subid);
        s.setSubname(subname);
        SubjectsService ss = new SubjectsService();
        String result = ss.storeSubjects(s);
        pw.print(result);
        RequestDispatcher rd = request.getRequestDispatcher("storesubject.jsp");
        rd.include(request, response);
	}

}
