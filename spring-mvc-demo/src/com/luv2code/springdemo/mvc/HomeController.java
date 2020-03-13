package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//added a comment
@Controller
public class HomeController {
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}

}
