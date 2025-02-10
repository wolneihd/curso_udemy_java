package secao_18_funcional_lambda.utils;

import java.util.function.Function;

import secao_18_funcional_lambda.entities.Product;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
