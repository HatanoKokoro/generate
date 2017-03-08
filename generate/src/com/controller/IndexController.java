package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class IndexController{

	
	@RequestMapping(value = {"/",""}, method = RequestMethod.GET)
	public ModelAndView toList (HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv = new ModelAndView("/index");
		return mv;
	}
	

}
