package com.cognizant.onetoone.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phonenumber {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int id;
	private String number;
	
	@OneToOne(mappedBy = "phoneNumber") 
	private User user;
	
}
