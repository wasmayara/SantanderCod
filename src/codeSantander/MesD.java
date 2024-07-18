package codeSantander;

import java.util.Scanner;
/*public enum DiaDaSemana {
    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6),
    DOMINGO(7);

    private int numeroDoDia;

    DiaDaSemana(int numeroDoDia) {
        this.numeroDoDia = numeroDoDia;
    }*/

 public enum MesAno {
    JANEIRO(31),
    FEVEREIRO(28), // 29 dias se for ano bissexto
    MARCO(31),
    ABRIL(30),
    MAIO(31),
    JUNHO(30),
    JULHO(31),
    AGOSTO(31),
    SETEMBRO(30),
    OUTUBRO(31),
    NOVEMBRO(30),
    DEZEMBRO(31);

    private int dias;

    MesAno(int dias) {
        this.dias = dias;
    }

    public int getDias(int ano) {
        if (this == FEVEREIRO && isBissexto(ano)) {
            return 29;
        }
        return this.dias;
    }

    private boolean isBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}

public class MesD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o mês (1 para Janeiro, 2 para Fevereiro, etc.): ");
        int mesEscolhido = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        MesAno mes = MesAno.values()[mesEscolhido - 1];
        int diasNoMes = mes.getDias(ano);

        System.out.println("O mês de " + mes.name().toLowerCase() + " no ano " + ano + " tem " + diasNoMes + " dias.");
    }
}
