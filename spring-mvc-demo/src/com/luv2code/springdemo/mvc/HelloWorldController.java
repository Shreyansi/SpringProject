package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	//need a controller method to show the initial the html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new a controller method read form data
	//add data to the model
	@RequestMapping("/processFormVersion2")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		//read the request param from html form
		String theName = request.getParameter("studentName");
		//convert the data all caps
		theName = theName.toUpperCase();
		//create message
		String result = "Yo " + theName;
		//add message to model
		model.addAttribute("message", result);
		return "helloworld";
	}
	

	@RequestMapping("/processFormVersion3")
	public String processFormVersion3(
			@RequestParam("studentName") String theName,
			Model model)
	{
		//convert the data all caps
		theName = theName.toUpperCase();
		//create message
		String result = "Hey My Friend from v3! " + theName;
		//add message to model
		model.addAttribute("message", result);
		return "helloworld";
	}

}
