package com.example.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "itineraries")
public class Itinerary {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name="day_number", nullable=false, precision=2)
	private int dayNumber;
	
    @Column(name="itinerary_detail",length = 2000)
    private String itineraryDetail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public String getItineraryDetail() {
		return itineraryDetail;
	}

	public void setItineraryDetail(String itineraryDetail) {
		this.itineraryDetail = itineraryDetail;
	}

}