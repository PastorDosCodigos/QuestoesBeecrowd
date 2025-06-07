package beecrowd1018;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        /**
         * Variáveis:
         * c: representa a cédula de 100 reais.
         * cin: representa a cédula de 50 reais.
         * v: representa a cédula de 20 reais.
         * d: representa a cédula de 10 reais.
         * ci: representa a cédula de 5 reais.
         * dois: representa a cédula de 2 reais.
         * um: representa a moeda de 1 real
         * Valor: recebe um valor inteiro.
         */
        int c = 0, cin = 0, v = 0, d = 0, ci = 0, dois = 0, um = 0;
        int Valor = ler.nextInt();
        /**
         * primeira linha de saída:
         * imprime o valor recebido pela variável Valor.
         */
        System.out.println(Valor);


        /**
         *A Seguir: um conjunto de repetição (while) para subtrair cada valor até que o valor atual
         *não caiba mais naquela "nota".
         */
        while(Valor >= 100){

            c++;
            Valor = Valor - 100;

        }
        while(Valor < 100 &&Valor >= 50){

            cin++;
            Valor = Valor - 50;

        }
        while(Valor < 50 && Valor >= 20){

            v++;
            Valor = Valor - 20;

        }
        while(Valor < 20 && Valor >= 10){

            d++;
            Valor = Valor - 10;

        }
        while(Valor >= 5){

            ci++;
            Valor = Valor - 5;

        }
        while( 5 > Valor && Valor >= 2){

            dois++;
            Valor = Valor - 2;

        }
        while( 2 > Valor && Valor >= 1){

            um++;
            Valor = Valor - 1;

        }

        /**
         * Saída:
         * Imprime a quantidade de cada nota obtida pelo o conjunto de while acima.
         */

        System.out.printf("%d nota(s) de R$ 100,00\n", c);
        System.out.printf("%d nota(s) de R$ 50,00\n", cin);
        System.out.printf("%d nota(s) de R$ 20,00\n", v);
        System.out.printf("%d nota(s) de R$ 10,00\n", d);
        System.out.printf("%d nota(s) de R$ 5,00\n", ci);
        System.out.printf("%d nota(s) de R$ 2,00\n", dois);
        System.out.printf("%d nota(s) de R$ 1,00\n", um);
    }
}