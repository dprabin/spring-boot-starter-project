package com.sts.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {
	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "Welcome to the home!";
	}
	
	@RequestMapping("/hello.html")
	@ResponseBody
	String hello(){
		return "Hello there!";
	}
	
	@RequestMapping("/index.html")
	@ResponseBody
	String index(){
		return "Hello there! this is the index.";
	}
}
