package secao_04_estrutura_condicional;

import java.util.Scanner;

public class aula_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EXERCICIO 02
        int idade;

        System.out.println("\nDigite a sua idade: ");
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

        // EXERCICIO 02
        int hora;
        System.out.println("\nDigite a hora: ");
        hora = sc.nextInt();

        if (hora >= 0 && hora <= 12) {
            System.out.println("Bom dia!");
        } else if (hora > 12 && hora <= 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        // 10min continuar

        sc.close();
    }
}
