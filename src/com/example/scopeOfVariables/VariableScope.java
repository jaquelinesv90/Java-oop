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
	 * parametro e n�o ao atributo da classe.
	 * Pode ser perceber quando faz referencia
	 * ao atributo da classe ele est� em azul.
	 * 
	 */
	public int calculateValue(int value) {
		
		 value = value + 10;
		 
		 return value;
	}
	/* Sempre colocar as chaves ap�s o for,mesmo que
	 * tenha apenas uma linha de c�digo.
	 * Fica mais f�cil de visualizar a delimita��o
	 * do escopo de vari�veis.
	 */
	public void test() {
		for(int i =0;i <10;i++) {
			System.out.println(i);
		}
	}
}
