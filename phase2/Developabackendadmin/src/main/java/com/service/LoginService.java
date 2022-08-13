package com.service;

import com.bean.Login;

public class LoginService {
	public String checkLoginDetails(Login ll)
	{
		if(ll.getEmail().equals("admin@gmail.com") && ll.getPassword().equals("admin"))
		{
			return "Successfully Logged In";
		}
		else
		{
			return "Failed to Login";
		}
	}
}