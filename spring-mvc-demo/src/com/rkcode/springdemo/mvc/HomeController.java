package com.rkcode.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		///WEB-INF/view/main-menu.jsp, prefix and suffice from configuration file
		return "main-menu";
	}
}

