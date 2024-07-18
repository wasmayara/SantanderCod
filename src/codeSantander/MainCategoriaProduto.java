package codeSantander;

import java.util.Scanner;

public class MainCategoriaProduto {
/*Crie um enum chamado CategoriaProduto representando 
categorias de produtos (ELETRONICO, VESTUARIO, ALIMENTO).
 Utilize um Scanner para obter a categoria do usuário e 
imprima uma mensagem correspondente*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CategoriaProduto catp = null;
		System.out.println("Digite a categoria do produto, ex: 1-ELETRONICO, 2-VESTUARIO, 3-ALIMENTO ");
		   int categoria = sc.nextInt();
		 
		   switch(categoria) {
		   case 1: catp = CategoriaProduto.ELETRONICO;
		  
		   System.out.println(CategoriaProduto.ELETRONICO);
		   
		   break;
		   
		   case 2: catp = CategoriaProduto.ALIMENTO;
		   
		   System.out.println(CategoriaProduto.ALIMENTO);
		   
		   break;
           case 3: catp = CategoriaProduto.VESTUARIO;
		   
		   System.out.println(CategoriaProduto.VESTUARIO);
		   break;
		 
		   
		   }
	      
		  
	
	
}
}
