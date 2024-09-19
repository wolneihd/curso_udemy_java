package secao_07_outros_topicos;

import java.util.Scanner;

public class aula_61 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero01 = sc.nextInt();
        int numero02 = sc.nextInt();
        int numero03 = sc.nextInt();

        int higher = max(numero01, numero02, numero03);      
        System.out.println("\n o maior valor é: " + higher);  

        sc.close();
    }

    public static int max(int numero01, int numero02, int numero03) {
        int aux;

        if (numero01 > numero02 && numero01 > numero03) {
            aux = numero01;
        } else if (numero02 > numero01 && numero02 > numero03) {
            aux = numero02;
        } else {
            aux = numero03;
        }
        return aux;
    }
}
