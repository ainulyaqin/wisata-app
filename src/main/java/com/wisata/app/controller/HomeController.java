package com.wisata.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(path = "/")
	public ModelAndView index() {
		ModelAndView a = new ModelAndView();
		a.setViewName("home");
		return a;
	}
	
	@RequestMapping(path = "/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping(path = "/register")
	public String register() {
		return "register";
	}
}
