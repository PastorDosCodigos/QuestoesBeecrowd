package beecrowd1010;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * Variáveis:
         * codp1, codp2: recebe o codigo das peças 1 e 2, respectivamente.
         * nump1, nump2: recebe a quantidade de peças 1 e 2, respectivamente.
         * valorp1, valorp2: recebe o valor das peças 1 e 2, respectivamente.
         * valortotal: soma o valor total da quantidade de peças 1 multiplicada pelo preço
         * com o valor total da quantidade de peças 2 multiplicada pelo preço.
         */
        int codp1 = ler.nextInt();
        int nump1 = ler.nextInt();
        double valorp1 = ler.nextDouble();
        int codp2 = ler.nextInt();
        int nump2 = ler.nextInt();
        double valorp2 = ler.nextDouble();
        double valortotal = (nump1*valorp1) + (nump2*valorp2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valortotal);

    }
}
