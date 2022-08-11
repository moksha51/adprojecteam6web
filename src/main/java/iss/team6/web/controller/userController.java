
 package iss.team6.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

  
  @Controller
  @RequestMapping("/") 
  public class userController {
  
	  @RequestMapping(value = "/create")
		public String list(Model model) {
			//model.addAttribute("users", ());
			return "createUserView";
		}
	

  
  }
 