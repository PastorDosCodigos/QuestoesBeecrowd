package beecrowd1007;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * Variáveis:
         * A, B, C, D: Variáveis que recebe os inteiros.
         * S: Variável que realiza a formula, dada pela questão, "diferença".
         */
        int A, B, C, D, S;
        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
        D = ler.nextInt();
        S = (A*B)-(C*D);

        System.out.printf("DIFERENCA = %d\n", S);

    }
}
