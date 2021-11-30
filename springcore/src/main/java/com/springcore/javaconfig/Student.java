package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

import com.springcore.lifecycle.Samosha;

//@Component("firstStudent")
public class Student {
	
	private Samosa samosa;
	

	public Samosa getSamosa() {
		return samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public void study() {
		this.samosa.display();
		System.out.println("Student is studying book");
	}
}
