package secao_18_funcional_lambda.utils;

import java.util.function.Consumer;

import secao_18_funcional_lambda.entities.Product;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
    
}
