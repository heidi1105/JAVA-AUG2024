package com.heidichen.firstweb.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("")
	public String demoPage() {
		return "demo.jsp";
	}
	
	@GetMapping("/jstl")
	public String jstlDemoPage(Model model) { // to create the container for jsp file
		model.addAttribute("name", "Pepper"); // name : "Pepper"
		Integer happiness = 10;
		Boolean isHungry = false;
		model.addAttribute("happiness", happiness); // happiness: 10
		model.addAttribute("isHungry", isHungry);
		
		ArrayList<String> skills = new ArrayList<>();
		skills.add("Breaking the code");
		skills.add("Sleeping while coding");
		skills.add("Bootstrap");
		model.addAttribute("skillList", skills);
		
		
		return "jstldemo.jsp";
	}
}
