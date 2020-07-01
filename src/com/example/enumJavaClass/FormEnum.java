package com.example.enumJavaClass;

//Enum dentro de classe
public class FormEnum {
	
	enum Gender{
		 FEMALE('F'), MALE('M');
		
		private char value;
		
		Gender(char value){
			this.value = value;
		}
	}
	
	private String name;
	private Gender gender;
	
	

}
