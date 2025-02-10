package secao_18_funcional_lambda;

import java.util.ArrayList;
import java.util.List;

import secao_18_funcional_lambda.entities.Product;
import secao_18_funcional_lambda.services.ProductServices;

public class aula_199 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        ProductServices ps = new ProductServices();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double sum = ps.filteredSum(list);
        System.out.println("TOTAL: " + sum);
    }
}
