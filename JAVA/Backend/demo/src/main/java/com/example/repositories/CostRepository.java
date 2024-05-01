package com.example.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Cost;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface CostRepository extends JpaRepository<Cost,Integer> 
{
	List<Cost> findByCostLessThan(int cost);
}