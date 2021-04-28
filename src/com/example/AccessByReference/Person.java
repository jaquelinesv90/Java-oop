package com.example.AccessByReference;

// modificadores de acesso: private, default, public, protected
public class Person {
	  
	private String name;
	private String address;
	private String foneNumber;
	private String id;
	
	// modificador padrão do java,
	// ele é visivel dentro do pacote
	String nomeVisibilidade;
	
	//todo mundo consegue enxergar
	public String nomeVisibilidadePublico;
	
	public Person(){}
	
	public Person(String name, String address,String foneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.foneNumber = foneNumber;
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
