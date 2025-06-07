package beecrowd1019;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * Variáveis:
         * s: Recebe um valor inteiro que representa a duração, em segundos, de um evento.
         * h: Representa as horas.
         * m: Representa os minutos.
         */
        int s = ler.nextInt();

        int h, m;
        /**
         * Horas(h) é o total de segundos(s) divido por 3600.
         */
        h = s / 3600;

        /**
         * A Variável s agora irá armazenar o resto da divisão de segundos(s) por 3600.
         */
        s = s % 3600;

        /**
         * Minutos(m) é o total de segundos(s) dividido por 60.
         */
        m = s/60;

        /**
         * A Variável s agora irá armazenar o resto da divisão de segundos(s) por 60.
         */
        s = s % 60;

        /**
         * Saída:
         * Irá imprimir as horas, minutos e segundos no formato pedido pela questão.
         */
        System.out.printf("%d:%d:%d\n", h, m, s);

    }
}