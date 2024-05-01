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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Customer;
import com.example.services.CustomerManager;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/")
public class CustomerController {

	@Autowired
	CustomerManager manager;
	
	
	@GetMapping("customer/login")   // used to get the customer id if the valid user has passed proper username and password 
	public Optional<Customer> getCustomerUsingUserNameAndPassword(@RequestParam String username, @RequestParam String password )
	{
		return manager.findByUserNameAndPassword(username, password);
	}
	
	@GetMapping("customers")
	public List<Customer> getAllCustomer()
	{
		return manager.getAllCustomers();
	}
	
	@GetMapping("customer/{id}")
	public Optional<Customer> Get(@PathVariable int id)
	{
		return manager.getCustomerById(id);
	}

	@PostMapping("customer")
	public void addCustomer(@RequestBody Customer customer)
	{
		manager.saveCustomer(customer);
	}
	
	@PutMapping("customer/{id}")
	public void update(@RequestBody Customer customer, @PathVariable int id) {
		customer.setId(id);
		manager.updateCustomer(customer);
	}
	
	@DeleteMapping("customer/{id}")
	public void delete(@PathVariable int id)
	{
		manager.deleteCustomerById(id);
	}

}