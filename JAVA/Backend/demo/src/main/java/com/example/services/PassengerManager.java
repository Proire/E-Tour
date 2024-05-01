package com.example.services;
import java.util.List;
import java.util.Optional;
import com.example.entity.Passenger;

public interface PassengerManager {
	List<Passenger> getAllPassangers();
	Optional<Passenger> getPassengerById(int id);
	public void savePassanger(Passenger passenger);
    void updatePassenger(Passenger passenger);
    void deletePassengerById(int Id);
}
