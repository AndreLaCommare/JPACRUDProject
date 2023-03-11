package com.skilldistillery.ufcfighters.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.ufcfighters.data.UFCFighterDAO;

@Controller
public class UFCFighterController {

	@Autowired
	private UFCFighterDAO dao;
	
	@RequestMapping (path = {"/", "home.do"})
	public ModelAndView goHome() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("fighters", dao.findAll());
		mv.setViewName("home");
		return mv;
	}
}
