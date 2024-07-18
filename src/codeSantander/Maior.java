package codeSantander;

import java.util.Scanner;
public class Maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        // Determinando o maior número usando o operador ternário
        int maior = (num1 > num2) ? 
                    ((num1 > num3) ? num1 : num3) : 
                    ((num2 > num3) ? num2 : num3);

        System.out.println("O maior número é: " + maior);

        scanner.close();

      
    }
}