package secao_10_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

import secao_10_arrays_listas.entities.Product;

public class aula_90 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vetor = new Product[n];

        for (int i = 0; i < n; i++) {
            /**
             * Quando você usa sc.nextDouble(), o método lê apenas o valor numérico e deixa o caractere de quebra de linha (Enter) no buffer de entrada. 
             * Então, na próxima vez que sc.nextLine() for chamado para ler o nome do produto, ele acaba lendo a quebra de linha restante no buffer, 
             * em vez de esperar por uma nova entrada.
             */
            sc.nextLine();
            String name = sc.nextLine();
            double valor = sc.nextDouble();
            vetor[i] = new Product(name,valor);
        }
        
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i].getPrice();
        }
        System.out.printf("A média dos produtos é: %.2f", (soma/n));

        sc.close();
    }
}
