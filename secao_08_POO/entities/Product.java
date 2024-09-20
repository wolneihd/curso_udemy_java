package secao_08_POO.entities;

public class Product {
    
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        double total = price * quantity;
        return total;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        String textoFormatado = "toString(): Produto: " + name + " | Quantidade: " + quantity + " | Total: " + quantity * price;
        return textoFormatado;
    }
}
