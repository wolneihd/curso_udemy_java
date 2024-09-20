package secao_08_POO;

import java.util.Locale;
import java.util.Scanner;
import secao_08_POO.entities.Calculator02;

public class aula_71_3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre o valor do raio: ");
        double radius = sc.nextDouble();

        double c = Calculator02.circunference(radius);

        double v = Calculator02.volume(radius);

        System.out.printf("\nCircunferência: %.4f", c);
        System.out.printf("\nVolume: %.4f", v);
        System.out.printf("\nValor do Pi: %.4f", Calculator02.PI);

        sc.close();
    }     
}
