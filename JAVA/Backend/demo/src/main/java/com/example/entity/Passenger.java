package com.example.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "passengers")
public class Passenger {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
	@Column(name = "passenger_name", nullable = false)
    private String passengerName;
    
	@Column(name = "birth_date", nullable = false)
    private Date birthDate;
    
	@Column(name = "passenger_type", nullable = false)
    private String passengerType;
    
	@Column(name = "passenger_amount", nullable = false)
    private int passengerAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public int getPassengerAmount() {
		return passengerAmount;
	}

	public void setPassengerAmount(int passengerAmount) {
		this.passengerAmount = passengerAmount;
	}
}