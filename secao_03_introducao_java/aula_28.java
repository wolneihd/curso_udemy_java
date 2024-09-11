package secao_03_introducao_java;
public class aula_28 {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.printf("\nRaiz quadrada de %.2f é %.2f", x, A);
        System.out.printf("\nRaiz quadrada de %.2f é %.2f", y, B);
        System.out.printf("\nRaiz quadrada de 25 é %.2f", C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.printf("\n%.2f elevado a %.2f é %.2f", x, y, A);
        System.out.printf("\n%.2f elevado ao quadrado é %.2f", x, B);
        System.out.printf("\n5 elevado ao quadrado é %.2f", C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.printf("\nO Valor absoluto de %.2f é %.2f", x, A);
        System.out.printf("\nO Valor absoluto de %.2f é %.2f", y, B);
        
    }
}
