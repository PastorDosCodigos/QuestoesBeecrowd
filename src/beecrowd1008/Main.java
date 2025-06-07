package beecrowd1008;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * Variáveis:
         * A: recebe o número do funcionário.
         * B: recebe o número de horas trabalhadas do funcionario.
         * C: recebe o valor que recebe por hora.
         * S: calcula o sálario do funcionario.
         */
        int A, B;
        double C, S;
        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextDouble();
        S = (C*B);

        System.out.printf("NUMBER = %d\n", A);
        System.out.printf("SALARY = U$ %.2f\n", S);

    }
}