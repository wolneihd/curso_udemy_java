package secao_06_estruturas_repetitivas;

import java.util.Scanner;

public class aula_45 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int x = sc.nextInt();

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        System.out.println("Total: " + soma);
        sc.close();
    }
}
