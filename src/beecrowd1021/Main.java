package beecrowd1021;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * Variáveis:
         * entrada: recebe um valor de ponto flutuante que representa o valor monetário.
         * totalcentavos: converte o valor lido para centavos (multiplicando por 100 e arredondando).
         * notas: array com os valores das notas em centavos (100.00, 50.00, 20.00, etc.)
         * moedas: Array com os valores das moedas em centavos (1.00, 0.50, 0.25, etc.)
         */
        double entrada = ler.nextDouble();

        int totalCentavos = (int) Math.round(entrada * 100);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        /**
         * Primeira linha da saída, assim como pedido pela questão.
         */
        System.out.println("NOTAS:");

        /**
         * para cada valor de nota, calcula quantas cabem no valor atual.
         * ja imprime o resultado de cada nota assim como pedido pela questão.
         */
        for (int nota : notas) {
            int qtd = totalCentavos / nota;
            System.out.printf("%d nota(s) de R$ %.2f\n", qtd, nota / 100.0);
            totalCentavos = totalCentavos % nota;
        }

        /**
         * imprime a linha "MOEDAS: " assim como pedido pela questão.
         */
        System.out.println("MOEDAS:");

        /**
         * para cada valor de moeda, calcula quantas cabem no valor atual.
         * ja imprime o resultado de cada moeda assim como pedido pela questão.
         */
        for (int moeda : moedas) {
            int qtd = totalCentavos / moeda; // quantidade de moedas
            System.out.printf("%d moeda(s) de R$ %.2f\n", qtd, moeda / 100.0);
            totalCentavos = totalCentavos % moeda; // atualiza o valor restante
        }
    }
}