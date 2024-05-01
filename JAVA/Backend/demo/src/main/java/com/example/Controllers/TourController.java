package com.example.Controllers;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Tour;
import com.example.services.TourManager;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/")
public class TourController 
{
	@Autowired
	TourManager manager;
	
	@GetMapping("tours")
	public List<Tour> getAllTours() {
		return manager.getAllTours();
	}
	
	@GetMapping("tours/{categoryId}")
	public List<Tour> getAllTours(@PathVariable int categoryId) {
		return manager.getTourByCategoryId(categoryId);
	}
	
	@GetMapping("tour/{id}")
	public Optional<Tour> Get(@PathVariable int id) {
		return manager.getTourById(id);
	}
	
	@PostMapping("tour")
	public void createProduct(@RequestBody Tour tour) {
		manager.saveTour(tour);
	}
	
	@PutMapping("tour/{id}")
	public void update(@RequestBody Tour tour,@PathVariable int id) {
		tour.setId(id);
		manager.updateTour(tour);
	}
	
	@DeleteMapping("tour/{id}")
	public void delete(@PathVariable int id) {
		manager.deleteTourById(id);
	}
}