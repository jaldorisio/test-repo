package com.saic.gmm.helloWorldService.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

	@ResponseBody
	@RequestMapping("/")
	public String sayHello() {
		return "Hello World!";
	}
	
}
