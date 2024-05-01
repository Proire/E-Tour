package com.example.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;

@Entity
@Table(name = "tours")
public class Tour {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "tour_id", referencedColumnName="id")
	private Set<Booking> bookings;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Set<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}
	
}
