package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Booking;
import com.example.repositories.BookingRepository;

@Service
public class BookingManagerImpl implements BookingManager

{   
	@Autowired
	BookingRepository repository;

	@Override
	public List<Booking> getAllBooking() {
		return repository.findAll();
	}

	@Override
	public Optional<Booking> getBookingById(int id) {
		return repository.findById(id);
	}

	@Override
	public void saveBooking(Booking booking) {
		repository.save(booking);
	}

	@Override
	public void updateBooking(Booking booking) {
		repository.save(booking);
	}

	@Override
	public void deleteBookingById(int id) {
		repository.deleteById(id);
	}

}