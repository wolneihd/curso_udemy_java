package secao_08_POO.entities;

public class Triangulo {
    
    public double ladoA;
    public double ladoB;

    public double area() {
        return ladoA * ladoB;
    }

    public double perimetro() {
        return 2 * (ladoA + ladoB);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
    }
}
