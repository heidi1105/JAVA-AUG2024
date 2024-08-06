package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
}
