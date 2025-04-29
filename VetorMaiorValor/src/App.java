import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int[] vetor = new int[15];
        int maiorValor = 0, posMaior = 0;

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Informe um numero para posicao %d: ", i);
            vetor[i] = teclado.nextInt();
            System.out.println();

        }
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > maiorValor) {

                maiorValor = vetor[i];
                posMaior = i;

            }
        }

        teclado.close();
        System.out.printf("O maior valor eh %d na posicao %d!\n", maiorValor, posMaior);

    }
}