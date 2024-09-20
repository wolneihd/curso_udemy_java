package secao_08_POO.entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    // se a função não retonar valores: public void

    public double area() {
        double p = (a + c + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
