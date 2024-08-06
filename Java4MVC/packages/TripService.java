package com.heidichen.mvcdemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.heidichen.mvcdemo.models.Trip;
import com.heidichen.mvcdemo.repositories.TripRepository;

@Service
public class TripService {

	private final TripRepository tripRepo;
	
	public TripService(TripRepository tripRepo) {
		this.tripRepo = tripRepo;
	}
	
	// find all
	public List<Trip> allTrips(){
		return tripRepo.findAll();
	}
	
	
	// create
	public Trip createTrip(Trip newTrip) {
		return tripRepo.save(newTrip);
	}
	
	// find one
	
	// edit
	
	// delete
}
