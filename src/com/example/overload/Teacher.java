package com.example.overload;

public class Teacher extends Person{

	private String salary;
	private String CourseName;
	
  
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	
	//salário liquido
	public double calculateNetWages() {
		return 0;
	}
	
}
