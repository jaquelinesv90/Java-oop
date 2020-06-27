package com.example.classType;

public class Externa {
	
	private String texto = "texto externo";
	
	public class Interna{
		private String texto = "texto interno";
		
		public void imprimeTexto() {
			System.out.println(texto);
			// consegue ver membros da classe externa
			System.out.println(Externa.this.texto);
		}
	}
	
	// para chamar um método interno é necessário instanciar
	// primeiro a classe externa depois a interna.
	public static void main(String[] args) {
		Externa externa = new Externa();
		Interna interna= externa.new Interna();
		
		interna.imprimeTexto();
	}

}
