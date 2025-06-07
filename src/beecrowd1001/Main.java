package beecrowd1001;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /**
         * variaveis:
         * A, B: recebe os valores inteiros.
         * X: realiza a adição dos valores A e B.
         */
        int A, B, X;


        A = ler.nextInt();
        B = ler.nextInt();
        X = A+B;


        System.out.printf("X = %d\n", X);
    }
}
