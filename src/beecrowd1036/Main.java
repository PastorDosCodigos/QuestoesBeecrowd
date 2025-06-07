package beecrowd1036;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /**
         * Variáveis:
         * A, B, C: recebem valores de ponto flutuante.
         * x1, x2 : armazena as raizes.
         * Delta: realiza o calculo do valor de delta.
         */
        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();
        double x1, x2;
        x1 = x2 = 0;
        double Delta = (B*B) - 4*A * C;

        /**
         * Testa se é possível realizar bhaskara com valores recebidos e o resultado de delta.
         */
        if (A > 0 && B > 0 && C > 0 && Delta >= 0){


            /**
             * realiza a fórumula de bhaskara.
             */
            x1 = ( -B + Math.sqrt(Delta))/(2*A);
            x2 = ( -B - Math.sqrt(Delta))/(2*A);

            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }
        else{

            System.out.print("Impossivel calcular\n");

        }
    }
}
