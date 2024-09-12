package secao_06_estruturas_repetitivas;

import java.util.Scanner;

public class aula_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;

        do {
            valor = sc.nextInt();  
        } while (valor != 0);

        sc.close();
    }
}
