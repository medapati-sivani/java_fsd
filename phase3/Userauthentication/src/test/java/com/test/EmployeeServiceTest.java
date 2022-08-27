package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.service.EmployeeService;

class EmployeeServiceTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Checking User details")
	void testCheckuser() {
		//fail("Not yet implemented");
		EmployeeService es=new EmployeeService();
		String result=es.checkuser("sivani@gmail.com", "123");
		assertEquals("success", result);
		
		String result1=es.checkuser("Sivani@gmail.com", "123");
		assertEquals("failure", result1);
		
		String result2=es.checkuser("sivani@gmail.com", "1234");
		assertEquals("failure", result2);
		
		String result3=es.checkuser("Sivani@gmail.com", "1234");
		assertEquals("failure", result3);
	}

}
