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
	 * parametro e não ao atributo da classe.
	 * Pode ser perceber quando faz referencia
	 * ao atributo da classe ele está em azul.
	 * 
	 */
	public int calculateValue(int value) {
		
		 value = value + 10;
		 
		 return value;
	}
	/* Sempre colocar as chaves após o for,mesmo que
	 * tenha apenas uma linha de código.
	 * Fica mais fácil de visualizar a delimitação
	 * do escopo de variáveis.
	 */
	public void test() {
		for(int i =0;i <10;i++) {
			System.out.println(i);
		}
	}
}
