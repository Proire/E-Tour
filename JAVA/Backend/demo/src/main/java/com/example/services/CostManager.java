package com.example.services;
import java.util.List;
import java.util.Optional;
import com.example.entity.Cost;


public interface CostManager 
{
	List<Cost> getAllCosts();
	List<Cost> getCostLessThan(int cost);
	Optional<Cost> getCostById(int id);
	void saveCost(Cost cost);
	void saveCosts(List<Cost> costs);
	void updateCost(Cost cost);
	void deleteCostById(int id);
}