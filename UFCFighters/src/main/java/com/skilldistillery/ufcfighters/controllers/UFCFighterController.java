package com.skilldistillery.ufcfighters.controllers;

import java.time.LocalDate;

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
	 public ModelAndView createFighter(@RequestParam("lastFightAlt") String date,UFCFighter ufc) {
		 ModelAndView mv = new ModelAndView();
		 LocalDate ld = LocalDate.parse(date);
		 ufc.setLastFight(ld);
		 UFCFighter fighter = dao.create(ufc);
		 
		 mv.addObject("fighter", fighter);
		 mv.setViewName("fighter/show");
		 return mv;
	 }
	 
	 @RequestMapping(path = "DeleteFighter.do")
		public ModelAndView deleteFighter(@RequestParam("id") int id) {
			boolean isDeleted = dao.deleteById(id);
			ModelAndView mv = new ModelAndView();
			mv.addObject("fighters", dao.findAll());
			mv.addObject("fighter", isDeleted);
			mv.setViewName("home");
			return mv;
			}
	 
	 @RequestMapping(path="UpdateFighter.do")
	 	public ModelAndView updateFighter(@RequestParam("id") int id) {
		 
		 ModelAndView mv = new ModelAndView();
		 UFCFighter fighter = dao.findById(id);
		 mv.addObject("fighter", fighter);
		 mv.setViewName("fighter/updateFighter");
		 return mv;
	 }
	 @RequestMapping(path="update.do")
	 public ModelAndView update(@RequestParam("lastFightAlt") String date, @RequestParam("id") int id, UFCFighter ufc) {
		 
		 ModelAndView mv = new ModelAndView();
		 LocalDate ld = LocalDate.parse(date);
		 ufc.setLastFight(ld);
		 ufc = dao.update(id, ufc);
		 mv.addObject("fighter", ufc);
		 mv.setViewName("fighter/show");
		 return mv;
	 }
	 
}
