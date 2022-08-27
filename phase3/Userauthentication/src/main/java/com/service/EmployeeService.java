package com.service;

public class EmployeeService {
	public String checkuser(String emailid, String password) {
		if(emailid.equals("sivani@gmail.com")&& password.contentEquals("123")) {
			return "success";
		}
		else {
			return "failure";
		}
	}
}
