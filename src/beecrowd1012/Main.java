package beecrowd1012;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * variáveis:
         * A, B, C: recebem valores com ponto flutuante de dupla precisão.
         * tr: a área do triângulo retângulo que tem A por base e C por altura.
         * ci:  a área do círculo de raio C. (pi = 3.14159).
         * t: a área do trapézio que tem A e B por bases e C por altura.
         * q: a área do quadrado que tem lado B.
         * r: a área do retângulo que tem lados A e B.
         */
        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();
        double tr = (A*C)/2;
        double ci = 3.14159*C*C;
        double t = (A+B)*C/2;
        double q = B*B;
        double r = A*B;

        /**
         * saída:
         * 5 linhas de dados que apresentam o resultados das aréas descritas acima.
         */
        System.out.printf("TRIANGULO: %.3f\n", tr);
        System.out.printf("CIRCULO: %.3f\n", ci);
        System.out.printf("TRAPEZIO: %.3f\n", t);
        System.out.printf("QUADRADO: %.3f\n", q);
        System.out.printf("RETANGULO: %.3f\n", r);
    }
}