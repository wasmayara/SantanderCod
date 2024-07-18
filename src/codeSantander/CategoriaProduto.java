package codeSantander;

public enum CategoriaProduto {
	ELETRONICO (1), VESTUARIO(2), ALIMENTO(3);

	private final int c;
	  
	// construtor que inicializa o valor do atributo final
	CategoriaProduto (int c) {
	      this.c = c;
	  }
	  // método get para obter o valor do atributo
	  public int getCategoriaProduto(int c) {
		  return c;
	  }
      
}
 /* 
 * public int CategoriaProduto() {
    return switch (this) {
    case ELETRONICO-> 1;
    case  VESTUARIO-> 2;
    case ALIMENTO-> 3;
    break;
    }
    return null;
}*/

