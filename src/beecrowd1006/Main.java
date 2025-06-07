package beecrowd1006;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * A, B, C: Recebe os valores de dupla precisão.
         * S: realiza a média de 3 notas com os pesos dados pela questão.
         */
        double A, B, C, S;
        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();
        S = ((A*2)+(B*3)+(C*5))/10;

        System.out.printf("MEDIA = %.1f\n", S);

    }
}

