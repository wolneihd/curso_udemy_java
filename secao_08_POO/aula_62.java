package secao_08_POO;

import java.util.Locale;
import java.util.Scanner;

public class aula_62 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC;
        double yA, yB, yC;

        System.out.println("Entre com os lados do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Entre com os lados do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("\nA área do triângulo X é: %.4f ", areaX);
        System.out.printf("\nA área do triângulo Y é: %.4f ", areaY);

        if (areaX > areaY) {
            System.out.println("\nA área do triângulo X é maior!");
        } else if (areaY > areaX) {
            System.out.println("\nA área do triângulo Y é maior!");
        } else {
            System.out.println("\nAmbos triângulos tem a mesma área!");
        }

        sc.close();
    }
}
