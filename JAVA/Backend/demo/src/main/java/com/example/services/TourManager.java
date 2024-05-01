package com.example.services;
import java.util.List;
import java.util.Optional;
import com.example.entity.Tour;


public interface TourManager {
		
	    List<Tour> getAllTours();
	    List<Tour> getTourByCategoryId(int categoryId);
	    Optional<Tour> getTourById(int id);
	    void saveTour(Tour tour);
	    void updateTour(Tour tour);
	    void deleteTourById(int id);
}