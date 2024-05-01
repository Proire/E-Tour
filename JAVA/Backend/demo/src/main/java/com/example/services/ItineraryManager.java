package com.example.services;


import com.example.entity.Itinerary;

import java.util.List;
import java.util.Optional;

public interface ItineraryManager 
{
	List<Itinerary> getAllItineraries();
	List<Itinerary> getItinerariesByCategoryId(int categoryId);
	Optional<Itinerary> getItineraryById(int id);
	void saveItinerary(Itinerary itinerary);
	void updateItinerary(Itinerary itinerary);
    void deleteCategoryById(int id);
} 