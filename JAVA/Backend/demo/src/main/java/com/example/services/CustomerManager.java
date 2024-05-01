package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entity.Customer;



public interface CustomerManager  
{
	List<Customer> getAllCustomers();
	Optional<Customer> findByUserNameAndPassword(String username, String password);
	Optional<Customer> getCustomerById(int id);
 	void saveCustomer(Customer customer);
 	void updateCustomer(Customer customer);
	void deleteCustomerById(int id);
}