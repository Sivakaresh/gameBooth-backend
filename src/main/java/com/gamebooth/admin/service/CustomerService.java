package com.gamebooth.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamebooth.admin.entity.CustomerEntity;
import com.gamebooth.admin.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<CustomerEntity> getCoustomers() {
		return customerRepository.findAll();
	}

	public CustomerEntity savEntities(CustomerEntity customerEntity) {
		return customerRepository.save(customerEntity);
	}

	public CustomerEntity getCustomerById(int id) {
		return customerRepository.findById(id).orElse(null);
	}
}
