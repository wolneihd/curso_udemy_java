package secao_10_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

import secao_10_arrays_listas.entities.Pessoa;

public class exercicio_01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite a quantidade de pessoas: ");
        int n = sc.nextInt();
        Pessoa[] vetor = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("\nDigite o nome: ");
            String nome = sc.nextLine();
            System.out.print("\nDigite a idade: ");
            int idade = sc.nextInt();
            System.out.print("\nDigite a altura: ");
            double altura = sc.nextDouble();
            vetor[i] = new Pessoa(nome,idade,altura);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d | nome: %s | idade: %d | altura: %.2f", i, vetor[i].getName(), vetor[i].getIdade(), vetor[i].getAltura());
        }

        sc.close();
    }
}
