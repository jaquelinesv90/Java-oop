package com.example.InterfaceAsType;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public void printMessage() {
		System.out.println(MyInterface.message);
	}

}
