package codeSantander;

import java.util.Scanner;

public class DiaDaSemana {
    public static String determinarDiaDSemana(int d) {
        return d==1 ? "Domingo" : (d == 2 ? "Segunda" : d == 3 ?"Ter�a":  d == 4 ?"Quarta": d == 5 ?"Quinta":d == 6 ?"Sexta" :  d == 7 ? "Sabado":"N�mero inv�lido, por favor insira um n�mero de 1 a 7");
       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um n�mero inteiro entre 1 e 7: ");
        int d = scanner.nextInt();

        String diadasemana = determinarDiaDSemana(d);
        System.out.println("O dia da Semana �: " + diadasemana);

        scanner.close();
    }


}