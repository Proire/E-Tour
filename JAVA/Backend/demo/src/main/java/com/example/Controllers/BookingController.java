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
import com.example.entity.Booking;
import com.example.services.BookingManagerImpl;


@RestController  
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/")
public class BookingController {
	
	 @Autowired
	 BookingManagerImpl manager;
	
	 @GetMapping("bookings")
	 public List<Booking> getAllBookings()
	 {
		  return manager.getAllBooking(); 
	 }
	 
	 @GetMapping("booking/{id}")
	 public Optional<Booking> getBookingById(@PathVariable int id)
	 {
		   return manager.getBookingById(id);
	 }
	 
	 @PostMapping("booking")
	 public void createBooking(@RequestBody Booking booking)
	 {
		   manager.saveBooking(booking);
	 }
	
	 @PutMapping("booking/{id}")
	 public void updateBooking(@RequestBody Booking booking,@PathVariable int id)
	 {
		   booking.setId(id);
		   manager.updateBooking(booking);
	 }
	 
	 @DeleteMapping("booking/{id}")
	 public void deleteBookingById(@PathVariable int id)
	 {
		    manager.deleteBookingById(id);
	 }
	 
}
