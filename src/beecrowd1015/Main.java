package beecrowd1015;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /**
         * Variáveis:
         * A,B,C,D: Recebem quatro valores de ponto flutuante que representam os eixos x e y de dois pontos quaisquer no plano.
         * Distancia: calcula a formula, dada pela questão, para medir a distancia entre dois pontos.
         */
        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();
        double D = ler.nextDouble();
        /**
         * Observação:
         * Math.sqrt: é um metodo para calcular a raiz quadrada de um valor. Utiliza um parametro de tipo  duplo flutuante.
         * Math.pow: é um metodo para calcular a potencia de um valor. Utiliza dois parametros(base, expoente).
         */
        double Distancia = Math.sqrt(Math.pow((A - C), 2) + Math.pow((B - D), 2));

        System.out.printf("%.4f\n", Distancia);

    }
}