package codeSantander;

public class M�diaDeN�merosPares {

	public static void main(String[] args) {
		/*Desenvolva um programa que calcule e imprima a m�dia dos 
n�meros pares em um array de inteiros que v�o de 1 ao 10. 
Lembrando para utilizar contator e operador de atribui��o.
*/
		
		int[] media = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int cont=0;
		int soma =0;
		
		for( int i= 0; i <media.length; i++) {
			if(media[i]%2==0) {
				
				soma = soma+ media[i]; 
				cont++;
			
	}}
		//System.out.println(soma);
		System.out.println(soma/cont);
		}
		
	 }
 

