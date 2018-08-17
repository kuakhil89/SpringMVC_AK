package com.zensar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	public WelcomeController() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor....");
	}
	@RequestMapping("/test")
	public String test()
	{
	
		return "test";
	}

}
