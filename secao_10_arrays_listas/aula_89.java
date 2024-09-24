package secao_10_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class aula_89 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite a quantidade de alturas: ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite a altura: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.printf("A média das alturas é: %.2f: ", (soma/vetor.length));

        sc.close();
    }
}
