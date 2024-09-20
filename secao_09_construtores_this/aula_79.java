package secao_09_construtores_this;

import java.util.Locale;
import java.util.Scanner;

import secao_09_construtores_this.entities.ProductEncapsulado;

public class aula_79 {
    public static void main(String[] args) {

                Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Instanciação da Classe Product (com 2 argumentos):
        ProductEncapsulado produto_01 = new ProductEncapsulado("TV",900, 10);

        System.out.printf("\nProduto: %s | Quantidade: %d | Total: %.2f", produto_01.getName(), produto_01.getQuantity(), produto_01.totalValueInStock());

        // Renomear utilizando o setName:
        produto_01.setName("Laptop");

        int novaQuantidade;
        System.out.print("\nEntre a nova quantidade de produtos: ");
        novaQuantidade = sc.nextInt();
        produto_01.addProduct(novaQuantidade);

        System.out.printf("\nProduto: %s | Quantidade: %d | Total: %.2f", produto_01.getName(), produto_01.getQuantity(), produto_01.totalValueInStock());

        System.out.print("\nEntre a nova quantidade de produtos a ser removida: ");
        novaQuantidade = sc.nextInt();
        produto_01.removeProduct(novaQuantidade);

        System.out.printf("\nProduto: %s | Quantidade: %d | Total: %.2f", produto_01.getName(), produto_01.getQuantity(), produto_01.totalValueInStock());

        // Automaticamente chama o método toString()
        System.out.printf("\n%s", produto_01);

        sc.close();
        
    }
}
