package secao_06_estruturas_repetitivas;

import java.util.Scanner;

public class aula_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade_vezes = sc.nextInt();

        for (int i = 1; i <= quantidade_vezes; i++) {
            System.out.printf("\nNúmero da vez - %d", i);
        }

        sc.close();
    }
}
