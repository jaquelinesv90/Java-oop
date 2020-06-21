package com.example.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		  
		Teacher teacher = new Teacher();
		
		student.setName("Maria");
		
		// desta maneira não tem acesso aos atributos
		// especificos do aluno
		Person student2 = new Student();
		student2.getFoneNumber();
	}
}
