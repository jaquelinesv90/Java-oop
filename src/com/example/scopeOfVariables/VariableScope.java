package com.example.scopeOfVariables;

public class VariableScope {
	
	private int value;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	/* a variavel value faz referencia ao 
	 * parametro e não ao atributo da classe(o value declarado ali em cima).
	 * Pode ser perceber quando faz referencia
	 * ao atributo da classe ele está em azul.
	 * 
	 */
	public int calculateValue(int value) {
		
		 value = value + 10;
		 
		 return value;
	}
	
	/* foi criada uma variavel local que tem o escopo somente
	 * dentro do método
	 * 
	 */
	public int test() {
		int value = 5;
		if(true) {
			value --;
		}
		return value;
	}
	
	/* Sempre colocar as chaves após o for,mesmo que
	 * tenha apenas uma linha de código.
	 * Fica mais fácil de visualizar a delimitação
	 * do escopo de variáveis.
	 */
	public void secondTest() {
		for(int i =0;i <10;i++) {
			System.out.println(i);
		}
	}
}
