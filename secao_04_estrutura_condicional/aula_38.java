package secao_04_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;


public class aula_38 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double conta = 50.0;

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        } 

        System.out.printf("\nSua conta foi de R$ %.2f", conta);

        sc.close();
    }
}
