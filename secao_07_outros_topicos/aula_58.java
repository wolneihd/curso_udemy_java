package secao_07_outros_topicos;

import java.util.Scanner;

public class aula_58 {
    public static void main(String[] args) {
        
        /**
         * &  E - bit-a-bit
         * | OU - bit-a-bit
         * ^ OU-exclusivo
         * 
         * Ele compara coluna por coluna. 
         */

        int n1 = 89; // 0101 1001 
        int n2 = 60; // 0011 1100

        System.err.println(' ');
        System.err.println(n1 & n2); // 0001 1000
        System.err.println(n1 | n2); // 0111 1101
        System.err.println(n1 ^ n2); // 0110 0101

        Scanner sc = new Scanner(System.in);

        // compara se o bit 32 é true:

        int mask = 0b00100000;
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.println("6° bit é 1");
        } else {
            System.out.println("6° bit é 0");
        }

        sc.close();
    }
}
