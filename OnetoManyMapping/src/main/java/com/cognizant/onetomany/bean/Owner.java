package com.cognizant.onetomany.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(inverseJoinColumns = @JoinColumn(name = "customer_id"))
	private List<Customer> customerList;

}

/*
 * Simple OneToMany in only one entity
 * 
 * 	- Create a third table with primary of the owning(many) side and p.k of another
 * 	  table is just a common attribute
 * 
 * 	- onetomany and joincolumn will not create the third table,it just add new attribute(wrong result)
 * 
 * 	- Using inverseJoinColumns in jointable we can specify the name for primary key in third table and
 * 	  joinColumns can be used to change the name of same entity
 * 
 * Simple OneToMany in both the entities
 * 
 * 	- 
 * 
 * 1,101
 * 1,102
 * 1,103
 * 2,101
 * 
 * 
 * 1,9001
 * 1,9002
 * 2,9001
 * 
 * 
 * 
 */