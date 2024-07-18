package codeSantander;

public class OperacaoMatematicaClasse {

	public static double realizarOperacao(double n1, double n2, OperacaoMatematicaEnum op) {
        switch (op) {
            case SOMA:
                return n1 + n2;
            case DIFERENCA:
                return n1 - n2;
               // break;
            case PRODUTO:
                return n1 * n2;
               // break;
            case DIVISAO:
                if (n2 != 0) {
                    return n1/n2;
                  } else {
                   System.out.println("Divisão por zero não é permitida.");
                  }
        }
        return 0;
	}
    
}
