package beecrowd1035;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * Variáveis:
         * A, B, C, D: Recebem valores inteiros.
         */
        int A = ler.nextInt();
        int B = ler.nextInt();
        int C = ler.nextInt();
        int D = ler.nextInt();

        /**
         * Testa se os requisitos dados pela questão são verdadeiros e imprime o resultado.
         */
        if
        (B > C &&
                D > A &&
                (C+D) > (A+B) &&
                C > 0 && D > 0 &&
                (A%2) == 0){

            System.out.println("Valores aceitos");
        }
        else{

            System.out.println("Valores nao aceitos");

        }


    }
}