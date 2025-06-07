package beecrowd1009;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * Variáveis:
         * A: recebe o nome de um vendedor.
         * B: recebe o salário fixo de um vendedor.
         * C: recebe o montante total das vendas efetuadas por este vendedor.
         * S: realiza a soma do salário fixo(B) e de 15% do montante total de vendas do vendedor(C).
         */
        String A;
        double B, C, S;
        A = ler.nextLine();
        B = ler.nextDouble();
        C = ler.nextDouble();
        S = (B+(C*0.15));

        System.out.printf("TOTAL = R$ %.2f\n", S);

    }
}