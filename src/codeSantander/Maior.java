package codeSantander;

import java.util.Scanner;
public class Maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro n�mero: ");
        int num3 = scanner.nextInt();

        // Determinando o maior n�mero usando o operador tern�rio
        int maior = (num1 > num2) ? 
                    ((num1 > num3) ? num1 : num3) : 
                    ((num2 > num3) ? num2 : num3);

        System.out.println("O maior n�mero �: " + maior);

        scanner.close();

      
    }
}