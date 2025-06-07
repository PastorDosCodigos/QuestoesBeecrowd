package beecrowd1013;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         *Variáveis:
         * A,B,S: Recebe 3 valores inteiros.
         * MaiorAB: Calcula a formula, dada pela questão, para salvar o maior entre A e B.
         * MaiorABS: Calcula a formula, dada pela questão, para salvar o maior entre MaiorAB e S.
         */
        int A = ler.nextInt();
        int B = ler.nextInt();
        int S = ler.nextInt();

        int MaiorAB = (A+B+Math.abs(A-B))/2;
        int MaiorABS = (MaiorAB+S+Math.abs(MaiorAB-S))/2;

        System.out.printf("%d eh o maior\n", MaiorABS);

    }
}