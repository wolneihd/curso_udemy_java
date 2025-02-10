package secao_18_funcional_lambda.utils;

import java.util.function.Predicate;

import secao_18_funcional_lambda.entities.Product;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product t) {
        return t.getPrice() >= 100.0;
    }

}
