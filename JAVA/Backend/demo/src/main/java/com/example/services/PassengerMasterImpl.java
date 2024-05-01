package com.example.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Passenger;
import com.example.repositories.PassengerRepository;


@Service
public class PassengerMasterImpl implements PassengerManager{
	
	@Autowired
	PassengerRepository repository;

	@Override
	public List<Passenger> getAllPassangers() {
		return repository.findAll();
	}

	@Override
	public Optional<Passenger> getPassengerById(int id) {
		return repository.findById(id);
	}

	@Override
	public void savePassanger(Passenger passenger) {
		repository.save(passenger);
	}

	@Override
	public void updatePassenger(Passenger passenger) {
		repository.save(passenger);
	}

	@Override
	public void deletePassengerById(int id) {
		repository.deleteById(id);
	}

}