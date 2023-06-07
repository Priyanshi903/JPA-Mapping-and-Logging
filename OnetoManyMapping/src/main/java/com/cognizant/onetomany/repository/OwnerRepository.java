package com.cognizant.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.onetomany.bean.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {

}
