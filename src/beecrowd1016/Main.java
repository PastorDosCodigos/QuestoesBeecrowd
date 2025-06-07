package beecrowd1016;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * Variáveis:
         * distancia: Recebe a distancia do carro Y em relação ao carro x.
         * tempo: calcula o tempo que leva o carro Y para se distanciar distancia do carro x.
         */
        int distancia = ler.nextInt();
        int tempo = distancia*2;

        System.out.printf("%d minutos\n", tempo);

    }
}