package com.codewithsm.firstrestapi;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsm.firstrestapi.entity.MyEntity;

public interface MyRepository extends JpaRepository<MyEntity, Integer> {
	
}
