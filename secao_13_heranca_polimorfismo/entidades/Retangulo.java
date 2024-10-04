package secao_13_heranca_polimorfismo.entidades;

import secao_13_heranca_polimorfismo.enums.Color;

public class Retangulo extends Shape {
    
    private double largura;
    private double altura;

    public Retangulo() { 
        super();
    }

    public Retangulo(Color color, double largura, double altura) {
        super(color);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }  

    @Override
    public double area() {
        return this.largura * this.altura;
    }

}
