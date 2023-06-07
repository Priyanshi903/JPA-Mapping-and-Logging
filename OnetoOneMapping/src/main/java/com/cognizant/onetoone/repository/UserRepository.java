package com.cognizant.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.onetoone.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
}
