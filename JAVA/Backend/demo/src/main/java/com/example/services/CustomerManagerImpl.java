package com.example.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Customer;
import com.example.repositories.CustomerRepository;

@Service
public class CustomerManagerImpl implements CustomerManager{

	@Autowired
	CustomerRepository repository;

	@Override
	public List<Customer> getAllCustomers() {
		return repository.findAll();
	}

	@Override
	public Optional<Customer> findByUserNameAndPassword(String username, String password) {
		return repository.findByUserNameAndPassWord(username, password);
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		return repository.findById(id);
	}

	@Override
	public void saveCustomer(Customer customer) {
		repository.save(customer);
	}


	@Override
	public void updateCustomer(Customer customer) {
		repository.save(customer);
	}
	
	
	@Override
	public void deleteCustomerById(int id) {
		repository.deleteById(id);
	}

}