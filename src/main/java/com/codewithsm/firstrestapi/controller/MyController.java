package com.codewithsm.firstrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codewithsm.firstrestapi.entity.MyEntity;
import com.codewithsm.firstrestapi.service.MyServiceStandard;

@RestController
public class MyController{
	
//	Service class object create
	@Autowired
	private MyServiceStandard myService;
	
//	get the home
	@GetMapping("/home")
	public String home() {
		return "Hey Spring Rest Api is Working well";
	}
	
//	Add student
	@PostMapping("/create")
	public MyEntity addStudent(@RequestBody MyEntity studentEntity) {
		return myService.addStudent(studentEntity);
	}
	
//	get the students list
	@GetMapping("/students")
	public List<MyEntity> getStudents(){
		return this.myService.getStudents();
	}
	
//	get a single student by id
	@GetMapping("/student/{studentId}")
	public MyEntity getStudent(@PathVariable String studentId) {
		return this.myService.getStudent(Integer.parseInt(studentId));
	}
	
//	update mapping
	@PutMapping("/student")
	public MyEntity updateStudent(@RequestBody MyEntity studentEntity) {
		return this.myService.updateStudent(studentEntity);
	}
	
//	delete mapping
	public void deleteStudent(@PathVariable String studentId) {
		this.myService.deleteStudent(Integer.parseInt(studentId));
	}
	
}