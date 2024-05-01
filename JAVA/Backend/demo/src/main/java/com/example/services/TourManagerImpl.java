package com.example.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Tour;
import com.example.repositories.TourRepository;

@Service
public class TourManagerImpl implements TourManager{
	
	@Autowired
	TourRepository repository;

	@Override
	public List<Tour> getAllTours() {
		return repository.findAll();
	}

	@Override
	public List<Tour> getTourByCategoryId(int categoryId) {
		return repository.findToursByCategoryId(categoryId);
	}

	@Override
	public Optional<Tour> getTourById(int id) {
		return repository.findById(id);
	}

	@Override
	public void saveTour(Tour tour) {
		repository.save(tour);
	}

	@Override
	public void updateTour(Tour tour) {
		repository.save(tour);
	}

	@Override
	public void deleteTourById(int id) {
		repository.deleteById(id);
	}
}