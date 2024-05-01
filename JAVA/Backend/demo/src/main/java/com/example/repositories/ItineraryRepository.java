package com.example.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.entity.Itinerary;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface ItineraryRepository extends JpaRepository<Itinerary, Integer>  
{
	@Query(value = "SELECT * FROM itineraries WHERE category_id = :categoryId", nativeQuery = true)
	List<Itinerary> findItinerariesByCategoryId(int categoryId);
}