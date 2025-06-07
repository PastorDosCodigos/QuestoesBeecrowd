package beecrowd1003;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /**
         * variaveis:
         * A, B: recebe os valores inteiros.
         * S: Realiza a soma dos valores.
         */
        int A, B, S;
        A = ler.nextInt();
        B = ler.nextInt();
        S = A+B;

        System.out.printf("SOMA = %d\n", S);

    }
}