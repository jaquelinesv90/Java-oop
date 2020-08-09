package com.example.accessModifiers;

// aula java 39
// sempre veja se o relacionamento é um/ é uma
public class Student extends Person{
	  
	private String course;
	private String[] score;
	
	public Student() {
		
	}
	
	public void accessChecker() {
		//está no mesmo pacote da classe person, ou seja tem acesso
		this.nomeVisibilidade = "banana";
	}
	

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public String[] getScore() {
		return score;
	}

	public void setScore(String[] score) {
		this.score = score;
	}

	//média
	public double gradeCalc() {
		return 0;
	}
		
	public boolean isAproved() {
		return true;
	}
}
