package codeSantander;

import java.util.Scanner;

public class MesDoAno {
	  public static String determinarMesdoAno(int m) {
	        return 	    m == 1 ? "Janeiro" :
                        m == 2 ? "Fevereiro" :
                        m == 3 ? "Mar�o" :
                        m == 4 ? "Abril" :
                        m == 5 ? "Maio" :
                        m == 6 ? "Junho" :
                        m == 7 ? "Julho" :
                        m == 8 ? "Agosto" :
                        m == 9 ? "Setembro" :
                        m == 10 ? "Outubro" :
                        m == 11 ? "Novembro" :
                        m == 12 ? "Dezembro":
                        "N�mero inv�lido, por favor insira um n�mero de 1 a 12.";
	        
	       
	  }

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um n�mero inteiro entre 1 e 12: ");
         int m = scanner.nextInt();
        String MesdoAno = determinarMesdoAno (m);
        
        System.out.println("O dia da Semana �: " + MesdoAno);
        
        
        
        
	}
}
       
