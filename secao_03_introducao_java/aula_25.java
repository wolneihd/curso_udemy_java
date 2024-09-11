package secao_03_introducao_java;
public class aula_25 {
    public static void main(String[] args) {
        // Exemplo 01
        int x, y;
        x = 5;
        y = 2 * 5;
        System.err.printf("%d - %d", x, y);

        /**
         * Exemplo 02:
         * Uma Boa prática é inserir .0 quando a variável é do tipo double.
         */
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        System.err.printf("\nA área do trapézio é de: %.2f m²", area);

        // Exemplo 03
        int c, d;
        double resultado;
        c = 5;
        d = 2;
        resultado = (double) c / d;
        System.err.printf("\nResultado: %.2f", resultado);
    }
}
