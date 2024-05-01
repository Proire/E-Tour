package com.example.services;
import java.util.List;
import com.example.entity.Booking;
import java.util.Optional;
public interface BookingManager {
	List<Booking> getAllBooking();
	Optional<Booking> getBookingById(int id);
	void saveBooking(Booking booking);
	void updateBooking(Booking booking);
	void deleteBookingById(int id);
}
