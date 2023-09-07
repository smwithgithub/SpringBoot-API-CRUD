package com.codewithsm.firstrestapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithsm.firstrestapi.MyRepository;
import com.codewithsm.firstrestapi.entity.MyEntity;

// service annotation used to initial this class as a service workspace
@Service
public class MyService implements MyServiceStandard {
	
	@Autowired
	public MyRepository repository;

//	add students into list by using service constructor
	@Override
	public MyEntity addStudent(MyEntity myEntity) {
		
		return repository.save(myEntity);
	}


//	getting students list
	@Override
	public List<MyEntity> getStudents() {
		
		return repository.findAll();
	}

//	getting single student
	@Override
	public MyEntity getStudent(int studentId) {

		return repository.findById(studentId).orElse(null);
	}

//	update method
	@Override
	public MyEntity updateStudent(MyEntity student) {
		repository.save(student);
		return student;
	}

//	delete method
	@Override
	public String deleteStudent(int studentId) {
		repository.deleteById(studentId);
		return "The Student's information's has been deleted";
	}
	
	
}