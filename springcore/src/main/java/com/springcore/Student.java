package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAdderss;
	
	// default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	//parameter constructor
	public Student(int studentId, String studentName, String studentAdderss) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAdderss = studentAdderss;
	}
	
	// getters setters
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAdderss() {
		return studentAdderss;
	}
	public void setStudentAdderss(String studentAdderss) {
		this.studentAdderss = studentAdderss;
	}
	
	
	//To string
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAdderss=" + studentAdderss
				+ "]";
	}

}
