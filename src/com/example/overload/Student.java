package com.example.overload;

// 
public class Student extends Person{
	  
	private String course;
	private String score;
	
	// sobreescrita de m�todo da classe m�e
	public String getNameAddress() {
		
		String s = "Endereco do aluno ";
		s += super.getAddress();
		
		return s;
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
