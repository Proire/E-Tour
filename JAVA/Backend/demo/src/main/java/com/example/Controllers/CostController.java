package com.example.Controllers;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Cost;
import com.example.services.CostManager;


@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/")
public class CostController {

	@Autowired
	CostManager manager;

	@GetMapping("costs")
	public List<Cost> getAllCosts() 
	{
		return manager.getAllCosts();
	}
	
	@GetMapping("costs/{cost}")
	public List<Cost> GetCostsLessThan(@PathVariable int cost) {
		return manager.getCostLessThan(cost);
	}
	
	@GetMapping("cost/{id}")
	public Optional<Cost> GetCostById(@PathVariable int id) {
		return manager.getCostById(id);
	}
	
	
	@PostMapping("cost")
	public void createCost(@RequestBody Cost cost) 
	{
		manager.saveCost(cost);
	}
	
	@PostMapping("costs")
	public void createCosts(@RequestBody List<Cost> costs) 
	{
		manager.saveCosts(costs);
	}

	@PutMapping("cost/{id}")
	public void updateCost(@RequestBody Cost cost, @PathVariable int id) {
		cost.setId(id);
		manager.updateCost(cost);
	}

	@DeleteMapping("cost/{id}")
	public void deleteCost(@PathVariable int id) {
		manager.deleteCostById(id);
	}
}