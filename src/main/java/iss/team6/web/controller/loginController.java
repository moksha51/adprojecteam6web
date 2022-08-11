package iss.team6.web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class loginController {
	@RequestMapping
	public String Default(Model model) {		
		
	return "default";
		
	}

	@RequestMapping("/login")
	public String login(Model model) {
		//model.addAttribute("name","Nyein");
		
		
	return "loginView";
		
	}
}
