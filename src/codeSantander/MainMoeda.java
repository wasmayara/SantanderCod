package codeSantander;

import java.util.Scanner;


public class MainMoeda {
/*Desenvolva um programa em Java que converta um valor em d�lar para 
real. Utilize um m�todo que receba o valor em d�lar como entrada e 
retorne o valor equivalente em real. 
Considere uma taxa de c�mbio fixa.
 Taxa de C�mbio: 4.86
*/
	public static double converterDolarReal(double d) {
		double resultado = d *4.86;
		 return resultado;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor em D�lar");
		 double dol = sc.nextDouble();
		 
		 double c = converterDolarReal(dol);
		
		System.out.println("O valor em real �: " + c);
	}
 
	}

