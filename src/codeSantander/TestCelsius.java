package codeSantander;

import java.util.Scanner;

public class TestCelsius {
	/*Elabore um programa em Java que pe�a ao usu�rio para inserir uma 
temperatura em graus Celsius. Desenvolva um m�todo que converta essa 
temperatura para Fahrenheit e mostre o resultado.
 F�rmula:
 (Celsius * 9 / 5) + 32
*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura que gostaria de converter de Celsius/Fahrenheit ");
		
		double temp = sc.nextDouble();
		CelsiusPF converter = new CelsiusPF();
		
		double fahrenheit = converter.CelsiusPF(temp);
		
		System.out.println("A temperatura em Fahrenheit �: " + fahrenheit);

		
	
	}
	
	    }


