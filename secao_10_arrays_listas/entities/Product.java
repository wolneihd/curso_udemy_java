package secao_10_arrays_listas.entities;

public class Product {
    
    private String name;
    private double price;
    private int quantity;

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

    // GET & SETTERs

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Não criado o SET-quantity para evitar lançamentos erroneos.
    public int getQuantity() {
        return this.quantity;
    }

    // DEMAIS MÉTODOS:

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

