package com.skilldistillery.ufcfighters.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.ufcfighters.data.UFCFighterDAO;
import com.skilldistillery.ufcfighters.entities.UFCFighter;

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
	
	 @GetMapping(path = "getFighter.do")
	  public ModelAndView getFighter(@RequestParam("id") int id) {
	    ModelAndView mv = new ModelAndView();

	    UFCFighter fighter = dao.findById(id);     
	    // film is unmanaged after it is outside of the transaction that exists in the DAO

	    mv.addObject("fighter", fighter);
	    mv.setViewName("fighter/show");
	    return mv;
	  }
	 
	 @RequestMapping(path="createFighter.do", method=RequestMethod.POST)
	 public ModelAndView createFighter(UFCFighter ufc) {
		 ModelAndView mv = new ModelAndView();
		 UFCFighter fighter = dao.create(ufc);
		 mv.addObject("fighter", fighter);
		 mv.setViewName("fighter/show");
		 return mv;
	 }
	 
	 
}
