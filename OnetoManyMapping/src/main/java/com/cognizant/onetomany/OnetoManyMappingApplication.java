package com.cognizant.onetomany;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.onetomany.bean.Customer;
import com.cognizant.onetomany.bean.Owner;
import com.cognizant.onetomany.repository.CustomerService;
import com.cognizant.onetomany.repository.OwnerRepository;

@SpringBootApplication
public class OnetoManyMappingApplication {

	public static void main(String[] args) {
	
		ApplicationContext context =  SpringApplication.run(OnetoManyMappingApplication.class, args);
	
	
		OwnerRepository ownerRepository = context.getBean(OwnerRepository.class);
		CustomerService customerService = context.getBean(CustomerService.class);
	
		Owner owner = new Owner();
		owner.setName("Ambani");
		owner.setCustomerList(new ArrayList<Customer>());
		
		Customer customer = new Customer();
		customer.setName("Akash");
		
		Customer customer2 = new Customer();
		customer2.setName("Chandu");
		
		owner.getCustomerList().add(customer);
		owner.getCustomerList().add(customer2);
		
		ownerRepository.saveAndFlush(owner);
	
	}

}

//1,101
//1,102
//2,101



