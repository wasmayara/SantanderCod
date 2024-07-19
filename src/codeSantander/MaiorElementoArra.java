package codeSantander;

public class MaiorElementoArra {
	
	    public static void main(String[] args) {
	        
	        double[] numeros = {1.5, 3.2, 7.4, 2.9, 6.3, 8.0, 4.7};
	        
	        // Chama o método para encontrar o maior elemento
	        double maior = encontrarMaiorElemento(numeros);
	        
	        // Imprime o maior elemento
	        System.out.println("O maior elemento do array é: " + maior);
	    }
	    
	    // Método para encontrar o maior elemento em um array de doubles
	   
	
	public static double encontrarMaiorElemento(double[] array) {
	    // Inicializa o maior elemento como o primeiro elemento do array
	    double maior = array[0];
	    
	    // Percorre o array para encontrar o maior elemento
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] > maior) {
	            maior = array[i];
	        }
	    }
	    
	    return maior;
	}
}
