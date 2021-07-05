package com.headlock.headlock.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String greeting(@RequestParam(value = "name", required = false, defaultValue = "파라미터 입력") String name,
			Model model) {
		model.addAttribute("name", name);
		return "index.html";
	}
	
	@RequestMapping("/map")
	public String Showmap() {
		return "map.html";
	}


	@RequestMapping("/home")
	public String goHome(HttpServletRequest request) {
		return "home.html";
	}

}