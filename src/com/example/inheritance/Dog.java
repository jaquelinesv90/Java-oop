package com.example.inheritance;


// Apesar de ter os mesmos atributos da pessoa N�O
// faz sentido extender(aplicar heran�a) nesse caso
// pois, deve se fazer a pergunta � um/ � uma (pessoa, superclasse)
public class Dog {
	 
	private String name;
	private String address;
	private String foneNumber;
	private String id;
	private String owner;
	
	
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
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}