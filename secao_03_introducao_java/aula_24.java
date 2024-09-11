package secao_03_introducao_java;
import java.util.Locale;

public class aula_24 {
    public static void main(String[] args) {
        // sem quebra de linha:
        System.err.print("teste");
        // com quebra de linha:
        System.out.println("teste");

        int y = 32;
        System.err.println(y);

        Locale.setDefault(Locale.US); // set programa para formatação texto US.
        double x = 10.35784;
        System.err.println(x);
        System.err.printf("%.2f%n", x);
        System.err.printf("%.4f%n", x);   
        System.err.printf("Resultado = %.2f metros%n", x);   

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f",nome,idade,renda);

        // Lista de Exercicio:
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'f';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        Locale.setDefault(Locale.forLanguageTag("pt-BR"));
        System.out.printf("\n\nProducts:\n%s, which price is $ %.2f\n",product1,price1);
        System.out.printf("%s, which price is $ %.2f\n\n",product2,price2);
        System.out.printf("Record: %d years old, code %d and gender: %c\n\n",age,code,gender);
        System.out.printf("Measure with eight decimal places: %.8f\n", measure);
        System.out.printf("Rouded (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);        
    }
}
