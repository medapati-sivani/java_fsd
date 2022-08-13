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

import com.bean.Classes;

import com.Dao.ClassesDao;
import com.service.ClassesService;



/**
 * Servlet implementation class ClassesController
 */
public class ClassesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ClassesService cs=new ClassesService();
		List<Classes> listofClasses=cs.findAllClasses();
		HttpSession hs=request.getSession();
		hs.setAttribute("listofClasses", listofClasses);
		response.setContentType("text/html");
		response.sendRedirect("viewclasses.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
        int no = Integer.parseInt(request.getParameter("no"));
        int cid = Integer.parseInt(request.getParameter("cid"));
        Classes c = new Classes();
        c.setNo(no);
        c.setCid(cid);
        ClassesService cs = new ClassesService();
        String result = cs.storeClasses(c);
        pw.print(result);
        RequestDispatcher rd = request.getRequestDispatcher("storeclasses.jsp");
        rd.include(request, response);
	}

}
