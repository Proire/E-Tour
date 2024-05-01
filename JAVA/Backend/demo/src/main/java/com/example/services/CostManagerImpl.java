package com.example.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Cost;

import com.example.repositories.CostRepository;

@Service
public class CostManagerImpl implements CostManager {
	
	@Autowired
	private CostRepository repository;

	@Override
	public List<Cost> getAllCosts() {
		return repository.findAll();
	}

	@Override
	public List<Cost> getCostLessThan(int cost) {
		return repository.findByCostLessThan(cost);
	}

	@Override
	public Optional<Cost> getCostById(int id) {
		return repository.findById(id);
	}

	@Override
	public void saveCost(Cost cost) {
		repository.save(cost);
	}

	@Override
	public void saveCosts(List<Cost> costs) {
		repository.saveAll(costs);
	}
	
	@Override
	public void updateCost(Cost cost) {
		repository.save(cost);
	}

	@Override
	public void deleteCostById(int id) {
		repository.deleteById(id);
	}

	
}