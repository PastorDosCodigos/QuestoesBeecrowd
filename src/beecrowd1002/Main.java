package beecrowd1002;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * variáveis
         * pi: variável que facilita a escrita do valor de pi no codigo.
         * B: variável que recebe o valor do raio.
         * A: variável que que realiza a formula da circuferencia.
         */
        double pi = 3.14159;
        double A, B;

        B = ler.nextDouble();
        A = pi*B*B;
        System.out.printf("A=%.4f\n", A);
    }
}