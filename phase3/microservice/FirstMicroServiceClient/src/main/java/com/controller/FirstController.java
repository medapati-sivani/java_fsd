package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@RequestMapping(value="firstClient")
	public String SayHello() {
		return "Welcome to spring boot with first micro server";
	}
}
