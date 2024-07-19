package codeSantander;

import java.util.Scanner;

public class MainUnidadeTemperatura {
/* Crie um enum chamado UnidadeTemperatura representando 
unidades de temperatura (CELSIUS, FAHRENHEIT, KELVIN).
 Escreva um programa que utiliza um Scanner para obter a 
unidade de temperatura atual do usuário e a unidade 
desejada, pedindo a temperatura atual e imprimindo a 
temperatura convertida.*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		UnidadeTemperatura temE = null;
		System.out.println("Informe a temperatura atual");
		double tempAtual = sc.nextDouble();
		
		System.out.println("Informe para qual escala você deseja a conversão");
		String con = sc.next();	
	    
	  
		// System.out.println(UnidadeTemperaturaClass.Converter(tempAtual, temE, con);
	}
}
