package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.Customer;
import com.user.entity.User;
import com.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<Customer> signUp(String userEmail, String userPassword) {
		
		User u = new User();
		u.setUserName(userEmail);
		u.setUserPassword(userPassword);
		
		return repo.signUp(u);
	}

	public List<Customer> saveCustomer(String customerName, String customerEmail, int customerAge, String customerAddress) {
		
		Customer c = new Customer();
		c.setCustomerName(customerName);
		c.setCustomerEmail(customerEmail);
		c.setCustomerAge(customerAge);
		c.setCustomerAddress(customerAddress);
		
		return repo.saveCustomer(c);
	}

	public Customer findCustomer(int customerId) {

		return repo.findCustomer(customerId);
	}

	public List<Customer> deleteCustomer(int customerId) {
		
		return repo.deleteCustomer(customerId);
	}

	public List<Customer> updateCustomer(int customerId, String customerName, String customerEmail, int customerAge, String customerAddress) {
		
		Customer c = new Customer();
		c.setCustomerId(customerId);
		c.setCustomerName(customerName);
		c.setCustomerEmail(customerEmail);
		c.setCustomerAge(customerAge);
		c.setCustomerAddress(customerAddress);
		
		return repo.updateCustomer(c);
	}

}
