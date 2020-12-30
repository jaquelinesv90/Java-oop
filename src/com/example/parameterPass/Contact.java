package com.example.parameterPass;

public class Contact {
	
	private String name;
	private String telephone;
	private String email;
	
	public Contact() {}
	
	public Contact(String name,String telephone,String email) {
		super();
		this.name = name;
		this.telephone = telephone;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 *  méthodo toString() retorna o valor fornecido no formato string.
	 *  existem duas formas de implementar:
	 *  primeira: quando é chamado na instancia de um objeto
	 *  ex: System.out.println(number.toString());
	 *  segunda: chama o método de membro da classe relevante, passando
	 *  o valor como um argumento.
	 *  ex: System.out.println(Integer.toString(12));
	 */
	@Override
	public String toString() {
		return "Contact [name=" + name + ", telephone=" + telephone + ", email=" + email + "]";
	}
	
	
}
