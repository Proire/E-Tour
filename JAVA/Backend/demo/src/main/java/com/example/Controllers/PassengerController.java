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


import com.example.entity.Passenger;
import com.example.services.PassengerManager;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/")
public class PassengerController {
//
	@Autowired
	PassengerManager manager;

	@GetMapping("passengers")
	public List<Passenger> getAllPassengers() {
		return manager.getAllPassangers();
	}
	
	@GetMapping("passenger/{id}")
	public Optional<Passenger> getPassengerById(@PathVariable int id) {
		return manager.getPassengerById(id);
	}

	
	@PostMapping("passenger")
	public void createPassanger(@RequestBody Passenger passenger) {
		manager.savePassanger(passenger);
	}

	@PutMapping("passenger/{id}")
	public void updatePassenger(@RequestBody Passenger passenger, @PathVariable int id) {
		passenger.setId(id);
		manager.savePassanger(passenger);
	}
	
	@DeleteMapping("passenger/{id}")
	public void deletePassengerById(@PathVariable int id) {
		manager.deletePassengerById(id);
	}

}