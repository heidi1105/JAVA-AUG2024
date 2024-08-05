package com.heidichen.sessionformdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	// -----------SESSIONS-------------
	@GetMapping("/sessions")
	public String sessionHome(HttpSession session) {
		
		
		// if count is not available in session, set as 0
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0); // the count is available in session
		}
		// increment by 1
		// 1. get the count from session and cast it to Integer
		Integer currentCount = (Integer) session.getAttribute("count");
		// 2. reset the session attribute with the current count +1
		session.setAttribute("count", currentCount + 1);
		
		return "sessions/home.jsp";
	}
	
	@GetMapping("/sessions/display")
	public String sessionDisplay() {
		return "sessions/display.jsp";
	}
	
	@GetMapping("/sessions/clear")
	public String resetSession(HttpSession session) {
		// session.invalidate(); // invalidate all the sessions
		session.removeAttribute("count"); // only remove count
		return "redirect:/sessions";
	}
	
	
	 // -----------REVIEW FORM -------------
	@GetMapping("/reviews")
	public String displayReviewForm() {
		return "reviews/reviewForm.jsp";
	}
	
	@PostMapping("/reviews/process")
	public String reviewFormProcess(
			@RequestParam("title") String title,
			@RequestParam("reviewer") String reviewer,
			@RequestParam("rating") Integer rating,
			@RequestParam("description") String description,
			HttpSession session
			) {
		session.setAttribute("title", title);
		session.setAttribute("reviewer", reviewer);
		session.setAttribute("rating", rating);
		session.setAttribute("description", description);
		return "redirect:/reviews/result";
	}
	
	@GetMapping("/reviews/result")
	public String reviewDisplayResult() {
		return "reviews/reviewDisplay.jsp";
	}
	
	
	
}
