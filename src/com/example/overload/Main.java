package com.example.overload;

public class Main {
	
	public static void main(String[] args) {
		// exemplo de polimorfismo em tempo de execução
		Person person = new Person();
		Person student = new Student();
		Person teacher = new Teacher();
		
		
		person.setAddress("Rua 1, numero 1");
		student.setAddress("Rua 2, numero 2");
		teacher.setAddress("Rua 3, numero 3");
		
		System.out.println(person.getNameAddress());
		System.out.println(student.getNameAddress());
		System.out.println(teacher.getNameAddress());
	}
	
	
}
