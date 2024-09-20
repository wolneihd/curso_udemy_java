package secao_08_POO;

import java.util.Scanner;
import secao_08_POO.entities.Product;

public class aula_67 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Product produto_01 = new Product();

        produto_01.name = "TV";
        produto_01.price = 900.00;
        produto_01.quantity = 10;

        System.out.printf("\nProduto: %s | Quantidade: %d | Total: %.2f", produto_01.name, produto_01.quantity, produto_01.totalValueInStock());

        int novaQuantidade;
        System.out.print("\nEntre a nova quantidade de produtos: ");
        novaQuantidade = sc.nextInt();
        produto_01.addProduct(novaQuantidade);

        System.out.printf("\nProduto: %s | Quantidade: %d | Total: %.2f", produto_01.name, produto_01.quantity, produto_01.totalValueInStock());

        System.out.print("\nEntre a nova quantidade de produtos a ser removida: ");
        novaQuantidade = sc.nextInt();
        produto_01.removeProduct(novaQuantidade);

        System.out.printf("\nProduto: %s | Quantidade: %d | Total: %.2f", produto_01.name, produto_01.quantity, produto_01.totalValueInStock());

        // Automaticamente chama o método toString()
        System.out.printf("\n%s", produto_01);

        sc.close();
    }
}
