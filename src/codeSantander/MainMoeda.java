package codeSantander;

import java.util.Scanner;


public class MainMoeda {
/*Desenvolva um programa em Java que converta um valor em dólar para 
real. Utilize um método que receba o valor em dólar como entrada e 
retorne o valor equivalente em real. 
Considere uma taxa de câmbio fixa.
 Taxa de Câmbio: 4.86
*/
	public static double converterDolarReal(double d) {
		double resultado = d *4.86;
		 return resultado;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor em Dólar");
		 double dol = sc.nextDouble();
		 
		 double c = converterDolarReal(dol);
		
		System.out.println("O valor em real é: " + c);
	}
 
	}

