package com.springMVC.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController{

	@RequestMapping( value="/index")
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1)
			throws Exception {
		// TODO Auto-generated method stub
		ModelAndView model=new ModelAndView();
		
		model.addObject("demoStr", "HelloWorld");
		model.setViewName("index");
		return model;
	}

}
