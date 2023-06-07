package com.cognizant.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.onetoone.bean.Phonenumber;
import com.cognizant.onetoone.bean.User;
import com.cognizant.onetoone.service.UserService;

@SpringBootApplication
@ComponentScan("com.*")
public class OnetoOneMappingApplication {
	
	private static UserService userService;

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(OnetoOneMappingApplication.class, args);
		
		userService = context.getBean(UserService.class);
		
		Phonenumber phonenumber = new Phonenumber();
		phonenumber.setNumber("6303811529");
		
		User user = new User();
		user.setName("chandu");
		user.setPhoneNumber(phonenumber);
		
		User user2 = new User();
		user2.setName("Priyanshi");
		
		userService.saveUser(user);
		userService.saveUser(user2);
		
	}

}
