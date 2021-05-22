package com.mt.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mt.springmvc.model.User;

@Controller
public class ContactController {
	@ModelAttribute
	public void CommonDataForModel(Model m) {
		m.addAttribute("Header", "Arnab is learning coding");
		m.addAttribute("desc", "Home for the programmer");
		System.out.println("Adding common data to the model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
//		m.addAttribute("Header", "Arnab is learning coding");
//		m.addAttribute("desc", "Home for the programmer");
		System.out.println("Creating forms");
		return "contact";
	}

	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleform(@ModelAttribute User user, Model model) {
//		model.addAttribute("Header", "Arnab is learning coding");
//		model.addAttribute("desc", "Home for the programmer");
		//System.out.println(user);
		return "success";
	}
	
	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//
//	public String handleform(
//			/* HttpServletRequest request */@RequestParam(name = "userName", required = false) String username,
//			@RequestParam("email") String useremail, @RequestParam("userPassword") String userPassword, Model model) {
////	String email = request.getParameter("email");
////	System.out.println("Email is="+email);
//
//		User user = new User();
//
//		user.setUserName(username);
//		user.setEmail(useremail);
//		user.setUserPassword(userPassword);
//		
//		System.out.println(user);
//
////		System.out.println("Username is=" + username);
////		System.out.println("User Email" + useremail);
////		System.out.println("User password" + userPassword);
////
////		// process
////		model.addAttribute("name", username);
////		model.addAttribute("email", useremail);
////		model.addAttribute("password", userPassword);
//        model.addAttribute("user", user);
//		return "success";
//	}
}
