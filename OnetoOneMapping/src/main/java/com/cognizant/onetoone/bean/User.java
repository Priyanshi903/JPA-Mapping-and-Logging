package com.cognizant.onetoone.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "user_phonenumber_joined_table", joinColumns = {
			@JoinColumn(name = "UserId") }, inverseJoinColumns = {
					@JoinColumn(name = "PhonenumberId") })
	private Phonenumber phoneNumber;

}

/*
 * Simple OneToOne in only one entity
 * 	- foreign key added to that entity.
 * 
 * 
 * Simple OneToOne in both the entities
 * - in both the tables the the foreign key got added.(2 Tables)
 * 
 * 
 * In bidirectional when we specify the mappedBy,primary key of that 
 * table got inserted in another table as foreign key. (2 tables)
 * 
 * 
 * 
 * Using join table annotation it creates a third table containing primary keys of 
 * both the tables as foreign keys. Where we need to specify mappedBy in one of the entity
 * and joinTable in another entity.(3 tables)
 * 
 * JoinColumn used for same entity primary key and 
 * inversejoincolumn for another entity in jointable.
 * 
 * only JoinColumn can be used to specify the name for the column to be joined
 * 
 * 
 * 
 */