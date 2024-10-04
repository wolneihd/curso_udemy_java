package secao_13_heranca_polimorfismo.entidades;

import secao_13_heranca_polimorfismo.enums.Color;

public class Circulo extends Shape {

    private double radius;

    public Circulo() {
        super();
    }

    public Circulo(Color color, double radius) {
        super(color);
        this.radius = radius;
    }    

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2.0);
    } 
}
