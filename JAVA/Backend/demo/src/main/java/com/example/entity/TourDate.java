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
import java.util.Set;
import java.sql.Date;
@Entity
@Table(name="dates")
public class TourDate {
	
		
	    private int id;
		
		@Column(name = "depart_Date", nullable = false)
	    private Date departDate;
		
		@Column(name = "end_Date", nullable = false)
	    private Date endDate;
		
		@Column(name = "number_of_days", nullable = false)
	    private int numberOfDays;
		
	    private Set<Tour> tour;
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		public Date getDepartDate() {
			return departDate;
		}

		public void setDepartDate(Date departDate) {
			this.departDate = departDate;
		}

		public Date getEndDate() {
			return endDate;
		}

		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}

		public void setNumberOfDays(int numberOfDays) {
			this.numberOfDays = numberOfDays;
		}
		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name = "departure_id", referencedColumnName="id")
		public Set<Tour> getTour() {
			return tour;
		}

		public void setTour(Set<Tour> tour) {
			this.tour = tour;
		}
		
		
}