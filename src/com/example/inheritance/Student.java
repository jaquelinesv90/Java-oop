package com.example.inheritance;

// sempre veja se o relacionamento � um/ � uma
// 
public class Student extends Person{
	  
	private String course;
	private String score;
	
	public Student() {
		
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	//m�dia
	public double gradeCalc() {
		return 0;
	}
		
	public boolean isAproved() {
		return true;
	}
}
