package com.example.Controllers;

import java.sql.Date;
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
import com.example.entity.TourDate;
import com.example.services.TourDateManager;


@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/")
public class DateController 
{
	@Autowired
	TourDateManager manager;
	
	@GetMapping("tourdates")
	public List<TourDate> getAllTourDates() {
		return manager.getAllTourDates();
	}
	
	@GetMapping("tourdates/{searchDate}")
	public List<TourDate> getTourDatesBetweenDepartDateAndEndDate(@PathVariable Date searchDate) {
		return manager.getTourDatesBetweenDepartDateAndEndDate(searchDate,searchDate);
	}
	
	@GetMapping("tourdate/{id}")
	public Optional<TourDate> getTourDateById(@PathVariable int id) {
		return manager.getTourDateById(id);
	}
	
	@PostMapping("tourdate")
	public void saveTourDate(@RequestBody TourDate tourDate) {
		manager.saveDate(tourDate);
	}
	
	@PutMapping("tourdate/{id}")
	public void updateTourDate(@RequestBody TourDate tourDate,@PathVariable int id) {
		tourDate.setId(id);
		manager.updateDate(tourDate);
	}
	
	@DeleteMapping("tourdate/{id}")
	public void deleteTourDate(@PathVariable int id) {
		manager.deleteTourDateById(id);
	}
	
}











