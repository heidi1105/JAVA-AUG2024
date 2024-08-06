package com.heidichen.mvcdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.heidichen.mvcdemo.models.Trip;
import com.heidichen.mvcdemo.repositories.TripRepository;

@Service
public class TripService {

	private final TripRepository tripRepo;
	
	public TripService(TripRepository tripRepo) {
		this.tripRepo = tripRepo;
	}
	
//	@Autowired 
//	private TripRepository tripRepo;
	
	// find all
	public List<Trip> allTrips(){
		return tripRepo.findAll();
	}
	
	
	// create
	public Trip createTrip(Trip newTrip) {
		return tripRepo.save(newTrip);
	}
	
	// find one
	public Trip findTripById(Long id) {
		Optional<Trip> optionalTrip = tripRepo.findById(id);
		if(optionalTrip.isPresent()) {
			return optionalTrip.get();
		}
		return null;
	}
	
	
	// edit
	public Trip editTrip(Trip updatedTrip) {
		return tripRepo.save(updatedTrip);
	}
	
	
	// delete
	public void deleteTripById(Long id) {
		tripRepo.deleteById(id);
	}
	
}
