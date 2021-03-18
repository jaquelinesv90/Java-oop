package com.example.enumJava;

/* A vantagem de utilizar enum sobre constantes é principalmente na hora que a
* gente ta declarando atributos na classe.
* ex: eu tenho controle sobre o valor que eu posso colocar nesse atributo, que os valores que eu posso 
* adicionar a ele  somente podem ser os valores declarados dentro do enum. 
* ENUM:  DiaSemana segunda = DiaSemana.SEGUNDA;
* CONSTANTE: int segunda = DiaSemanaConstante.SEGUNDA;(poderia atribuir o valor 10 a esse atributo)
*/

public enum DaysOfWeekEnum {
	
	SEGUNDA, TERCA,QUARTA,QUINTA,SEXTA,SABADO,DOMINGO;

}
