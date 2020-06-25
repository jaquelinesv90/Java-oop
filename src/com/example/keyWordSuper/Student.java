package com.example.keyWordSuper;


public class Student extends Person{
	
	private String course;
	private String score;

	
	public Student() {
		super();
	}

	// Posso adicionar os campos desta classe
	// this: serve para referenciar as variaveis desta classe
	// super: faz referencia a superclasse(neste caso Person)
	public Student(String name, String address,String course,String score) {
		super(name, address);
		this.course = course;
	}

	// acessando atributos da classe mãe
	public void metodoQualquer() {
		super.setId("1234");
		
		this.setName("maria");
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
	
	//média
	public double gradeCalc() {
		return 0;
	}
		
	public boolean isAproved() {
		return true;
	}
}
