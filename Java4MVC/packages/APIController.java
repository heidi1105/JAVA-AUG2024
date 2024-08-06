package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heidichen.mvcdemo.models.Trip;
import com.heidichen.mvcdemo.services.TripService;

@RestController
@RequestMapping("/api")
public class APIController {

	private final TripService tripService;

	public APIController(TripService tripService) {
		this.tripService = tripService;
	}
	
	
	@GetMapping("/trips")
	public List<Trip> findAllTrips(){
		return tripService.allTrips();
	}
	
	/* 
	@PostMapping("/trips")
	public Trip addTrip(
			@RequestParam("location") String location,
			@RequestParam("owner") String owner,
			@RequestParam("tripLength") Integer tripLength,
			@RequestParam("description") String description
			) {
		Trip newTrip = new Trip();
		newTrip.setDescription(description);
		newTrip.setLocation(location);
		newTrip.setOwner(owner);
		newTrip.setTripLength(tripLength);
		return tripService.createTrip(newTrip);
	}
	*/
	
	@PostMapping("/trips")
	public Trip addTrip(@ModelAttribute("newTrip") Trip newTrip
			) {
		return tripService.createTrip(newTrip);
	}
	
	// find one
	@GetMapping("/trips/{id}")
	public Trip oneTrip(@PathVariable("id")Long id) {
		return tripService.findTripById(id);
	}
	
	// edit one
	/*
	@PutMapping("/trips/{id}")
	public Trip updateTrip(
			@PathVariable("id")Long id, // cannot be tripId, has to be called ID to perform an edit
			@RequestParam("location") String location,
			@RequestParam("owner") String owner,
			@RequestParam("tripLength") Integer tripLength,
			@RequestParam("description") String description) {
		Trip targetTrip = tripService.findTripById(id);
		targetTrip.setDescription(description);
		targetTrip.setLocation(location);
		targetTrip.setOwner(owner);
		targetTrip.setTripLength(tripLength);
		return tripService.editTrip(targetTrip);
	}
	*/
	
	@PutMapping("/trips/{id}")
	public Trip updateTrip(
			@PathVariable("id")Long id, // cannot be tripId, has to be called ID to perform an edit
			@ModelAttribute("oneTrip") Trip oneTrip) {
		return tripService.editTrip(oneTrip);
	}
	
	
	@DeleteMapping("/trips/{id}")
	public void deleteTrip(@PathVariable("id")Long id) {
		tripService.deleteTripById(id);
	}
	
	
}
