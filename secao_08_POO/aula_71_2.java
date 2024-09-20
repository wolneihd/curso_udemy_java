package secao_08_POO;

import java.util.Locale;
import java.util.Scanner;
import secao_08_POO.entities.Calculator;

public class aula_71_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("\nEntre o valor do raio: ");
        double radius = sc.nextDouble();

        double c = calc.circunference(radius);

        double v = calc.volume(radius);

        System.out.printf("\nCircunferência: %.4f", c);
        System.out.printf("\nVolume: %.4f", v);
        System.out.printf("\nValor do Pi: %.4f", calc.PI);

        sc.close();
    }     
}
