package codeSantander;

import java.util.Scanner;

public class MainOperacaoMatematica {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
		double n1 = scan.nextDouble();
		
		System.out.println("Informe o segundo valor");
		double n2 = scan.nextDouble();
		
		System.out.println("informe qual a operação matemática que deseja efetuar(+,-,*,/)");
		char op = scan.next().charAt(0);
		
		OperacaoMatematicaEnum operacaoEnum = null;
		switch(op) {
			case '+':
				operacaoEnum = OperacaoMatematicaEnum.SOMA;
				break;
				
			case '-':
			operacaoEnum = OperacaoMatematicaEnum.DIFERENCA;
			break;
			
			case '*':
				operacaoEnum = OperacaoMatematicaEnum.PRODUTO;
				break;
			case '/':
				operacaoEnum = OperacaoMatematicaEnum.DIVISAO;
				break;
	}
		
		OperacaoMatematicaClasse opc = new OperacaoMatematicaClasse();
		double resultado = opc.realizarOperacao(n1, n2, operacaoEnum);
        System.out.println(resultado);
    }
		
	}


