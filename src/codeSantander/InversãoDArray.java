package codeSantander;

public class InversãoDArray {

	public static void main(String[] args) {
		/*Escreva um programa que inverta a ordem dos elementos em um 
array de caracteres.*/

		char[]  elemento = {'x','y','z'};
		  for(int i = 0 ; i < elemento.length; i++) {
			  System.out.println(elemento[i]);
			  
		  }
		  int n = elemento.length;
	        for (int i = 0; i < n / 2; i++) {
	            char temp = elemento[i];
	            elemento[i] = elemento[n - 1 - i];
	            elemento[n - 1 - i] = temp;
	        }
	        
	        // Imprime o array invertido
	        System.out.print("Array invertido: ");
	        for (int i = 0; i < elemento.length; i++) {
	            System.out.print(elemento[i] + " ");
	        }
		    
				  
	        }
	    
		  }
	
