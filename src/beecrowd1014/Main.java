package beecrowd1014;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /**
         * Variáveis:
         * A: recebe o valor dos quilometros percorridos.
         * B: recebe o valor do combustivel gasto.
         * R: Calcula a distancia percorrida(A) divida pelo combustivel gasto(B) para saber o consumo médio.
         */
        int A = ler.nextInt();
        double B = ler.nextDouble();
        double R = A/B;

        System.out.printf("%.3f km/l\n", R);

    }
}