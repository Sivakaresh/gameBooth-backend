package com.gamebooth.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gamebooth.admin.entity.CustomerEntity;
import com.gamebooth.admin.service.CustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerControler {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/viewCustomer")
	public List<CustomerEntity> viewCustomerEntity() {
		return customerService.getCoustomers();
	}

	@PostMapping("/addCustomer")
	public CustomerEntity addCustomerEntity(@RequestBody CustomerEntity customerEntity) {
		return customerService.savEntities(customerEntity);
	}

	@GetMapping("/viewCustomer/{id}")
	public CustomerEntity viewByIDCustomerEntity(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}

}
