package com.codewithsm.firstrestapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Table(name = "Student_Table")
public class MyEntity{
	
	@Id
	private int id;
	
	private int roll;
	private String name;
	private String dept;
	
//	empty constructor
	public MyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

//	perameterized constructor
	public MyEntity(int id, int roll, String name, String dept) {
		super();
		this.id=id;
		this.roll = roll;
		this.name = name;
		this.dept = dept;
	}

//	setter and getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
}