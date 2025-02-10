package secao_18_funcional_lambda.services;

import java.util.List;

import secao_18_funcional_lambda.entities.Product;

public class ProductServices {
    public double filteredSum(List<Product> list) {
        double sum = 0.0;
        for (Product p: list) {
            sum = sum + p.getPrice();
        }
        return sum;
    }
}
