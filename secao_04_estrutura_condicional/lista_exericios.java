package secao_04_estrutura_condicional;

import java.util.Scanner;

public class lista_exericios {
    public static void main(String[] args) {
        // exemplo 01
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é
        // negativo ou não.
        int numero;
        System.out.println("\nDigite o número desejado: ");
        Scanner sc = new Scanner(System.in);

        numero = sc.nextInt();

        if (numero >= 0) {
            System.out.printf("\nO número %d é POSITIVO", numero);
        } else {
            System.out.printf("\nO número %d é NEGATIVO", numero);
        }

        // exemplo 02
        // Fazer um programa para ler um número inteiro e dizer se este número é par ou
        // ímpar.
        System.out.println("\nDigite o número desejado: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("\nO número %d é PAR", numero);
        } else {
            System.out.printf("\nO número %d é IMPAR", numero);
        }

        // exemplo 03
        // Verificar se 2 números são multiplos
        int num1, num2;
        System.out.println("\nDigite o número 01: ");
        num1 = sc.nextInt();
        System.out.println("\nDigite o número 02: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            if (num1 % num2 == 0) {
                System.out.printf("\nOs números %d e %d são multiplos", num1, num2);
            } else {
                System.out.printf("\nOs números %d e %d NÃO são multiplos", num1, num2);
            }
        } else {
            if (num2 % num1 == 0) {
                System.out.printf("\nOs números %d e %d são multiplos", num1, num2);
            } else {
                System.out.printf("\nOs números %d e %d NÃO são multiplos", num1, num2);
            }
        }

       sc.close();
    }
}
