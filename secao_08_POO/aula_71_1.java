package secao_08_POO;

import java.util.Locale;
import java.util.Scanner;

public class aula_71_1 {

    /**
     * Constantes deve ser todas em letras maiúsculas.
     * final: o valor não pode ser alterado.
     * não pode chamar um método NÃO-estático em outro que seja estático.
     */

    public static final double PI = 3.14159;
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre o valor do raio: ");
        double radius = sc.nextDouble();

        double c = circunference(radius);

        double v = volume(radius);

        System.out.printf("\nCircunferência: %.4f", c);
        System.out.printf("\nVolume: %.4f", v);
        System.out.printf("\nValor do Pi: %.4f", PI);

        sc.close();
    }

    public static double circunference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }    
}
