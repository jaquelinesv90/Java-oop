package com.example.accessModifiers;

// aula java 39
// sempre veja se o relacionamento � um/ � uma
public class Student extends Person{
	  
	private String course;
	private String[] score;
	
	public Student() {
		
	}
	
	public void accessChecker() {
		//est� no mesmo pacote da classe person, ou seja tem acesso
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

	//m�dia
	public double gradeCalc() {
		return 0;
	}
		
	public boolean isAproved() {
		return true;
	}
}
