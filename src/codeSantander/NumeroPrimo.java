package codeSantander;

import java.util.Scanner;

public class NumeroPrimo {
/*Pe�a ao usu�rio para inserir um n�mero inteiro usando 
Scanner. Utilize o operador tern�rio para determinar se o 
n�mero inserido � primo ou n�o, sem usar estruturas de 
controle de fluxo.
*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
	        int num = sc.nextInt();
	        
	        String resultado = num > 1 
	                ? (num == 2)  ||(num == 3) || (num== 5) ||(num ==7)? "O n�mero � primo" 
	                : (num % 2 != 0 
	                && num % 3 != 0 
	                && num % 5 != 0 
	                && num % 7 != 0 
	                ? "O n�mero � primo" 
	                : "O n�mero n�o � primo") 
	                : "O n�mero n�o � primo";
	            
	            
	            sc.close();
	            System.out.println(resultado);
	}

}
