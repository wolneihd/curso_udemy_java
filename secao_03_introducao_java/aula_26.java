package secao_03_introducao_java;
import java.util.Scanner;

public class aula_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x); 

        int numero;
        numero = sc.nextInt();
        System.out.println("Você digitou: " + numero);

        double numero_com_virgula;
        numero_com_virgula = sc.nextDouble();
        System.out.println("Você digitou: " + numero_com_virgula);

        char caracter;
        caracter = sc.next().charAt(0);
        System.out.println("Você digitou: " + caracter);

        // ideal é encerrar ao final do código.
        sc.close();
    }
}
