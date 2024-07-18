package codeSantander;

import java.util.Scanner;

public class NumeroPrimo {
/*Peça ao usuário para inserir um número inteiro usando 
Scanner. Utilize o operador ternário para determinar se o 
número inserido é primo ou não, sem usar estruturas de 
controle de fluxo.
*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
	        int num = sc.nextInt();
	        
	        String resultado = num > 1 
	                ? (num == 2)  ||(num == 3) || (num== 5) ||(num ==7)? "O número é primo" 
	                : (num % 2 != 0 
	                && num % 3 != 0 
	                && num % 5 != 0 
	                && num % 7 != 0 
	                ? "O número é primo" 
	                : "O número não é primo") 
	                : "O número não é primo";
	            
	            
	            sc.close();
	            System.out.println(resultado);
	}

}
