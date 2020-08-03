package com.gamebooth.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamebooth.admin.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
