package iss.team6.web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class homeController {

	@RequestMapping("/home")
	public String home(Model model) {
		//model.addAttribute("name","Home Page");
		
		
	return "barchart";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		//model.addAttribute("name","Home Page");
		
		
	return "about";
	}
	
	@RequestMapping("/locate")
	public String locatebin(Model model) {
		//model.addAttribute("name","Home Page");
		
		
	return "mapView";
		
	}
	@RequestMapping("/profile")
	public String profile(Model model) {
		//model.addAttribute("name","Home Page");
		
		
	return "userView";
	}
	
	@RequestMapping("/trashify")
	public String trashify(Model model) {
		//model.addAttribute("name","Home Page");
		
		
	return "trashifyView";
	}
}
