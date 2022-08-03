package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.getWriter().append("Served at: ").append(req.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String Username= req.getParameter("uname");
		String Password= req.getParameter("pass");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
	
		
		if(Username.equals("sivani586@gmail.com") && Password.equals("xyz@123"))
		{
			//servlet collaboration
			resp.sendRedirect("WelcomeServlet");
		}
		else
		{
			out.println("<h1 align='center'>Username or password is incorrect</h1>");
		}

	}

}
