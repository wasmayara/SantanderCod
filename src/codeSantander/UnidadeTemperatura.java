package codeSantander;

public enum UnidadeTemperatura {

	CELSIUS(1),FAHRENHEIT(2) , KELVIN(3);
	

	private final int c;
	  
	// construtor que inicializa o valor do atributo final
	UnidadeTemperatura (int c) {
	      this.c = c;
	  }
	  // método get para obter o valor do atributo
	  public int getUnidadeTemperatura(int c) {
		  return c;
}
}
/*Crie um enum chamado MainUnidadeTemperatura representando 
unidades de temperatura (CELSIUS, FAHRENHEIT, KELVIN).
 Escreva um programa que utiliza um Scanner para obter a 
unidade de temperatura atual do usuário e a unidade 
desejada, pedindo a temperatura atual e imprimindo a 
temperatura convertida.
 CELSIUS:
 F -> (celsius * 9 / 5) + 32
 K -> celsius + 273.15
 FAHRENHEIT:
 C -> (fehrenheit - 32) * 5 / 9
 k -> (fehrenheit + 459.67) * 5 / 9
*/