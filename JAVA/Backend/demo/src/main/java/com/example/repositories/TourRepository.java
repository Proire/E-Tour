package com.example.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.entity.Tour;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface TourRepository extends JpaRepository<Tour, Integer> 
{
	@Query(value = "SELECT * FROM tours WHERE category_id = :categoryId", nativeQuery = true)
	List<Tour> findToursByCategoryId(int categoryId);
}