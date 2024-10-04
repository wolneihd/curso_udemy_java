package secao_13_heranca_polimorfismo;

import secao_13_heranca_polimorfismo.entidades.ImportedProduct;
import secao_13_heranca_polimorfismo.entidades.Product;
import secao_13_heranca_polimorfismo.entidades.UsedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aula_136 {

    public static void main(String[] args) {

        List<Product> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        char resposta;
        String nome, dataFabricacao;
        double preco, taxa;

        for (int i = 1; i <= 3; i++) {
            System.out.printf("\nDigite o tipo do produto: [n]ovo | [u]sado | [i]mportado --> ");
            resposta = sc.next().charAt(0);

            sc.nextLine();
            System.out.printf("\nO nome do produto: ");
            nome = sc.nextLine();

            System.out.printf("\nO preço do produto: ");
            preco = sc.nextDouble();

            if (resposta == 'n') {
                produtos.add(new Product(nome, preco));
            } else if (resposta == 'i') {
                System.out.printf("\nTaxa de importação: ");
                taxa = sc.nextDouble();
                produtos.add(new ImportedProduct(nome, preco, taxa));
            } else {
                sc.nextLine();  // Limpar o buffer novamente antes de ler a data
                System.out.printf("\nData de fabricação (dd/MM/yyyy): ");
                dataFabricacao = sc.nextLine();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataFabricacaoFormatada = LocalDate.parse(dataFabricacao, formato);   
                produtos.add(new UsedProduct(nome, preco, dataFabricacaoFormatada));         
            }
        }

        for (Product produto: produtos) {
            System.out.println(produto.priceTag());
        }

        sc.close();
    }
}
