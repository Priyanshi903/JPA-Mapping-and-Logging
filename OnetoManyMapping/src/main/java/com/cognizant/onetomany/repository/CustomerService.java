package com.cognizant.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.onetomany.bean.Customer;

@Repository
public interface CustomerService extends JpaRepository<Customer, Integer> {

}
