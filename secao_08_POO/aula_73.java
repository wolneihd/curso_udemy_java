package secao_08_POO;

import java.util.Locale;
import java.util.Scanner;
import secao_08_POO.entities.CurrencyConverter;

public class aula_73 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        System.out.printf("\nQual a cotação do dólar: ");
        double cotacao = sc.nextDouble();

        System.out.printf("\nQual a quantidade de dólares comprados: ");
        double quantidade = sc.nextDouble();

        // convertUsdToBrl() é statis, por isso chama a classe por CurrencyConverter:
        double total = CurrencyConverter.convertUsdToBrl(cotacao, quantidade);
        System.out.printf("A quantidade em reais é de: %.2f: ", total);

        sc.close();;
    }
    
}
