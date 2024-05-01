package com.example.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="costs")
public class Cost {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "cost", nullable = false)
    private int cost;
	
	@Column(name = "single_person_cost", nullable = false)
    private int singlePersonCost;
	
	@Column(name = "extra_person_cost", nullable = false)
    private int extraPersonCost;
	
	@Column(name = "child_with_bed", nullable = false)
    private int childWithBed;
	
	@Column(name = "child_without_bed", nullable = false)
    private int childWithoutBed;
	
	@Column(name = "valid_from", nullable = false)
    private Date validFrom;
	
	@Column(name = "valid_to", nullable = false)
    private Date validTo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getSinglePersonCost() {
		return singlePersonCost;
	}

	public void setSinglePersonCost(int singlePersonCost) {
		this.singlePersonCost = singlePersonCost;
	}

	public int getExtraPersonCost() {
		return extraPersonCost;
	}

	public void setExtraPersonCost(int extraPersonCost) {
		this.extraPersonCost = extraPersonCost;
	}

	public int getChildWithBed() {
		return childWithBed;
	}

	public void setChildWithBed(int childWithBed) {
		this.childWithBed = childWithBed;
	}

	public int getChildWithoutBed() {
		return childWithoutBed;
	}

	public void setChildWithoutBed(int childWithoutBed) {
		this.childWithoutBed = childWithoutBed;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}
}
