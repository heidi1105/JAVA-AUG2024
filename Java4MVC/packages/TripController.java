package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.heidichen.mvcdemo.models.Trip;
import com.heidichen.mvcdemo.services.TripService;

import jakarta.validation.Valid;

@Controller
public class TripController {
	
	private final TripService tripService;

	public TripController(TripService tripService) {
		this.tripService = tripService;
	}
	
	@GetMapping("/trips")
	public String tripDashboard(Model model) {
		// get all the trips from service
		List<Trip> allTrips = tripService.allTrips();
		// store it in Model model 
		model.addAttribute("tripList", allTrips);
		return "dashboard.jsp";
	}
	
	// details
	@GetMapping("/trips/{id}")
	public String tripDetailsPage(@PathVariable("id") Long id, Model model) {
		// get id from Path
		// get the trip from service
		Trip oneTrip = tripService.findTripById(id);
		// store it in Model model
		model.addAttribute("oneTrip", oneTrip);
		return "details.jsp";
		
	}
	
	// display the form
	@GetMapping("/trips/new")
	public String newTripForm(Model model) {
		// Make sure Model model includes a variable called newTrip that is corresponding to jsp form:form
		Trip newTrip = new Trip();
		model.addAttribute("newTrip", newTrip);
		return "newTrip.jsp";
	}
	
	// process the form
	@PostMapping("/trips/new")
	public String newTripProcess(@Valid @ModelAttribute("newTrip") Trip newTrip, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "newTrip.jsp"; // return the jsp, not redirect!!!!!!!!
		}
		tripService.createTrip(newTrip);
		return "redirect:/trips";
	}
	
	// Edit Page
	@GetMapping("/trips/{id}/edit")
	public String editTripForm(@PathVariable("id")Long id, Model model) {
		// 1. grab id from path
		// 2. grab the trip from service
		Trip oneTrip = tripService.findTripById(id);
		// 3. store it in Model model
		model.addAttribute("oneTrip", oneTrip);
		return "editTrip.jsp";
	}
	
	@PutMapping("/trips/{id}/edit")
	public String editTripProcess(
			@Valid @ModelAttribute("oneTrip") Trip oneTrip, 
			BindingResult result, @PathVariable("id")Long id) {
		if(result.hasErrors()) {
			return "editTrip.jsp";
		}
		tripService.editTrip(oneTrip);
		return "redirect:/trips/"+id;
	}
	
	@DeleteMapping("/trips/{id}")
	public String deleteTripProcess(@PathVariable("id")Long id) {
		tripService.deleteTripById(id);
		return "redirect:/trips";
	}
	
	
	
}
