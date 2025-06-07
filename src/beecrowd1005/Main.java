package beecrowd1005;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * variaveis:
         * A, B: recebe os valores ponto flutuante de dupla precisão.
         * S: realiza a média dos valores recebidos dado os pesos a cada variavel.
         */
        double A, B, S;
        A = ler.nextDouble();
        B = ler.nextDouble();
        S = ((A*3.5)+(B*7.5))/11;

        System.out.printf("MEDIA = %.5f\n", S);

    }
}