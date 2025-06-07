package beecrowd1004;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /**
         * variaveis:
         * A, B: recebe os valores inteiros.
         * S: Realiza a multiplicação dos valores.
         */
        int A, B, S;
        A = ler.nextInt();
        B = ler.nextInt();
        S = A*B;

        System.out.printf("PROD = %d\n", S);

    }
}