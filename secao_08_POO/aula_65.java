package secao_08_POO;

import java.util.Locale;
import java.util.Scanner;

import secao_08_POO.entities.Triangle;

public class aula_65 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com os lados do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com os lados do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.c + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.a) * (p - y.c));

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
