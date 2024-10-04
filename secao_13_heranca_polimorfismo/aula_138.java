package secao_13_heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;

import secao_13_heranca_polimorfismo.entidades.Circulo;
import secao_13_heranca_polimorfismo.entidades.Retangulo;
import secao_13_heranca_polimorfismo.entidades.Shape;
import secao_13_heranca_polimorfismo.enums.Color;

public class aula_138 {
    public static void main(String[] args) {
        
        List<Shape> shapes = new ArrayList<>();

        Shape retangulo = new Retangulo(Color.BLACK, 5 ,2 );
        Shape circulo = new Circulo(Color.BLUE, 3);

        shapes.add(retangulo);
        shapes.add(circulo);

        for (Shape shape: shapes) {
            System.out.println("\nArea: " + shape.area());
        }
    }
}
