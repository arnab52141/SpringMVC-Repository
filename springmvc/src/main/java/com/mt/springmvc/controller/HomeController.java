package com.mt.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home(Model model) {
	System.out.println("This is a home url");
	model.addAttribute("name", "LALU PRASAD YADAV");
	model.addAttribute("id", 480);
	
	List<String> friends=new ArrayList<String>();
	friends.add("Varshini");
	friends.add("Thappa");
	
	model.addAttribute("friendlist", friends);
	
		return "index";
	}
@RequestMapping("/about")
public String about() {
System.out.println("This is about url");
return "about";
}


@RequestMapping("/help")
public ModelAndView help() {
	System.out.println("This is help url");
	
	//creating Model and View Object
	ModelAndView mav=new ModelAndView();
	
	//setting the data
	mav.addObject("name", "UttamChand");
	mav.addObject("id",155);
	LocalDateTime now = LocalDateTime.now();
	mav.addObject("time",now);
	
	//Marks
	List<Integer> list=new ArrayList<Integer>();
	list.add(21);
	list.add(212);
	list.add(220);
	
	mav.addObject("marks",list);
	
	
	//setting the view name
	mav.setViewName("help");
	return mav;
}






}
