package com.example.enumJavaClass;

public class FormEnum {
	
	
	enum Gender{
		 FEMALE('F'), MALE('M');
		
		private char value;
		
		Gender(char value){
			this.value = value;
		}
		
	}
	
	

}
