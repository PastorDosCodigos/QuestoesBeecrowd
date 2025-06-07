package beecrowd1020;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * Variáveis:
         * idade: receber um valor inteiro que representa a idade em dias.
         * a: representa os anos.
         * m: representa os meses.
         * d: representa os dias.
         */
        int idade = ler.nextInt();

        int a, m, d;

        /**
         * divide a idade em dias por 365 armazena o resultado na variavel a.
         */
        a = idade/365;

        /**
         * pega o resto da divisão da variavel idade por 365 e armazena na variavel idade.
         */
        idade = idade % 365;

        /**
         * divide a idade em dias por 30 armazena o resultado na variavel m.
         */
        m = idade/30;

        /**
         * pega o resto da divisão da variavel idade por 30 e armazena na variavel d.
         */
        d = idade % 30;

        /**
         * Saída:
         * imprime as variaveis a, m e d no formato pedido pela questão.
         */
        System.out.printf("%d ano(s)\n",a);
        System.out.printf("%d mes(es)\n",m);
        System.out.printf("%d dia(s)\n",d);

    }
}
