package secao_09_construtores_this.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    // Construtor sem argumentos:
    public Product() {}

    // Construtor com 03 argumentos:
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }   

    // Construtor com 02 argumentos:
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        // this.quantity = 0; -- Ele sabe que inicia com 0. Default do Java.
    } 

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
        String textoFormatado = "\ntoString(): Produto: " + name + " | Quantidade: " + quantity + " | Total: " + quantity * price;
        return textoFormatado;
    }    
}
