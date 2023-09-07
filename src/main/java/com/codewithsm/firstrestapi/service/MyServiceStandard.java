package com.codewithsm.firstrestapi.service;

import java.util.List;

import com.codewithsm.firstrestapi.entity.MyEntity;

// interface to make lose coupling between controller and service class objects
public interface MyServiceStandard {
	
//	student creating method
	public MyEntity addStudent(MyEntity myEntity);
	
//	student list getting method
	public List<MyEntity> getStudents();
	
//	signle student getting method
	public MyEntity getStudent(int studentId);
	
//	student update
	public MyEntity updateStudent(MyEntity student);
	
//	delete student
	public String deleteStudent(int studentId);

}
