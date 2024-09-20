package secao_08_POO;

import secao_08_POO.entities.Triangulo;

public class exercicio_01 {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo();

        triangulo.ladoA = 3.00;
        triangulo.ladoB = 4.00;

        System.out.printf("\nA área do retângulo: %.2f", triangulo.area());
        System.out.printf("\nA perimetro do retângulo: %.2f", triangulo.perimetro());
        System.out.printf("\nA diametro do retângulo: %.2f", triangulo.diagonal());        
    }
}
