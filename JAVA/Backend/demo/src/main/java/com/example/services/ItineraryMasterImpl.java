package com.example.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Itinerary;
import com.example.repositories.ItineraryRepository;

@Service
public class ItineraryMasterImpl implements ItineraryManager {
	
	@Autowired
	ItineraryRepository repository;

	@Override
	public List<Itinerary> getAllItineraries() {
		return repository.findAll();
	}

	public List<Itinerary> getItinerariesByCategoryId(int categoryId)
	{
		return repository.findItinerariesByCategoryId(categoryId);
	}
	@Override
	public Optional<Itinerary> getItineraryById(int id) {
		return repository.findById(id);
	}

	@Override
	public void saveItinerary(Itinerary itinerary) {
		repository.save(itinerary);
	}

	@Override
	public void updateItinerary(Itinerary itinerary) {
		repository.save(itinerary);
	}

	@Override
	public void deleteCategoryById(int id) {
		repository.deleteById(id);
	}
}