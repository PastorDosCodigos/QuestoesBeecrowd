package beecrowd1017;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * Variáveis:
         * t: recebe o valor do tempo gasto na viagem em horas.
         * kh: recebe o valor da velocidade média, em km/h, durante a viagem.
         * km: calcula a distancia percorrida, em km, na viagem.
         * l: divide a distancia percorrida pelo gasto médio de combustivel, 12 litros por km.
         */
        int t = ler.nextInt();
        int kh = ler.nextInt();

        int km = kh*t;
        double l = km/12.0;

        /**
         * Saída:
         * Imprime a quantidade de litros necessária para realizar a viagem.
         */
        System.out.printf("%.3f\n", l);
    }
}
