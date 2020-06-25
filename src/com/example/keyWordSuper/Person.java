package com.example.keyWordSuper;

public class Person {
	  
	private String name;
	private String address;
	private String foneNumber;
	private String id;
	
	public Person() {}

	// Como esta classe n�o extend nenhuma outra classe
	// o super dela ser� para a classe Object
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFoneNumber() {
		return foneNumber;
	}
	public void setFoneNumber(String foneNumber) {
		this.foneNumber = foneNumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
