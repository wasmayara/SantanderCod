package codeSantander;

public class UnidadeTemperaturaClass {

	public static double Converter(double n1, UnidadeTemperatura unidadeAtual,  UnidadeTemperatura unidadeDesejada ) {
        
           
        if (unidadeAtual== unidadeDesejada) {
            return n1;
        }

        double celsius = 0;

        // Converte a temperatura para Celsius
        switch (unidadeAtual) {
            case CELSIUS:
                celsius = n1;
                break;
            case FAHRENHEIT:
                celsius = (n1 - 32) * 5 / 9;
                break;
            case KELVIN:
                celsius = n1 - 273.15;
                break;
        }

        // Converte a temperatura de Celsius para a unidade desejada
        switch (unidadeDesejada) {
            case CELSIUS:
                return celsius;
            case FAHRENHEIT:
                return (celsius * 9 / 5) + 32;
            case KELVIN:
                return celsius + 273.15;
        }

        return 0; // Este retorno nunca será atingido
    }
}



