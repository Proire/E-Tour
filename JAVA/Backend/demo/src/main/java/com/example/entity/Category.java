package com.example.entity;



import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
@Table(name="categories")
public class Category {
	
	
	private int id;

	private String category;
    
    @Column(name = "sub_category", nullable = false)
	private String subCategory;
    
    @Column(name = "category_name", nullable = false)
	private String categoryName;
    
    @Column(name = "category_image_path", nullable = false)
	private String catImagePath;
    
    @Column(name = "flag", nullable = false)
	private String flag;
	
	private Set<Itinerary> itineraries;
	private Set<TourDate> dates;
	private Set<Cost> costs;
	private Set<Tour> tours;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id", referencedColumnName="id")
	public Set<Itinerary> getItineraries() {
		return itineraries;
	}
	public void setItineraries(Set<Itinerary> itineraries) {
		this.itineraries = itineraries;
	}
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id", referencedColumnName="id")
	public Set<TourDate> getDates() {
		return dates;
	}
	public void setDates(Set<TourDate> dates) {
		this.dates = dates;
	}
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id", referencedColumnName="id")
	public Set<Cost> getCosts() {
		return costs;
	}
	public void setCosts(Set<Cost> costs) {
		this.costs = costs;
	}
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id", referencedColumnName="id")
	public Set<Tour> gettours() {
		return tours;
	}
	public void setTours(Set<Tour> tours) {
		this.tours = tours;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "category", nullable = false)
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCatImagePath() {
		return catImagePath;
	}
	public void setCatImagePath(String catImagePath) {
		this.catImagePath = catImagePath;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
