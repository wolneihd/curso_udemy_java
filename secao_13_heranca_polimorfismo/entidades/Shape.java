package secao_13_heranca_polimorfismo.entidades;

import secao_13_heranca_polimorfismo.enums.Color;

public abstract class Shape {
    
    private Color color;

    public Shape() { }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();

}
