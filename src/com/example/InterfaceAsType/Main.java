package com.example.InterfaceAsType;

/* Observe como a variavel � declarada como do tipo de interface,
 * enquanto o objeto criado � do tipo MyInterfaceImpl.
 * Java permite isso porque a classe MyInterfaceImpl implementa a 
 * interface MyInterface.
 */
public class Main {
	
	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceImpl();
		myInterface.printMessage();
	}
	

}
