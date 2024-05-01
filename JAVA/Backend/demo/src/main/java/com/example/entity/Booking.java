package com.example.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "bookings")
public class Booking {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "booking_date", nullable = false)
    private Date bookingDate;
	
	@Column(name = "number_of_passengers", nullable = false)
    private int numberOfPassengers;
	
	@Column(name = "tour_amount", nullable = false)
    private int tourAmount;
	
	@Column(name = "taxes", nullable = false)
    private int taxes;
	
	@Column(name = "total_amount", nullable = false)
    private int totalAmount;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "booking_id", referencedColumnName="id")
	private Set<Passenger> passengers;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getBookingDate() {
		return bookingDate;
	}


	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}


	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}


	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}


	public int getTourAmount() {
		return tourAmount;
	}


	public void setTourAmount(int tourAmount) {
		this.tourAmount = tourAmount;
	}


	public int getTaxes() {
		return taxes;
	}


	public void setTaxes(int taxes) {
		this.taxes = taxes;
	}


	public int getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "booking_id", referencedColumnName="id")
	public Set<Passenger> getPassengers() {
		return passengers;
	}


	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}
    
	
}
