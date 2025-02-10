package secao_18_funcional_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import secao_18_funcional_lambda.entities.Product;
import secao_18_funcional_lambda.utils.PriceUpdate;
import secao_18_funcional_lambda.utils.ProductPredicate;

public class aula_196 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(new ProductPredicate());

        // neste caso, passo por cada elemento da lista e aplica o método.
        list.removeIf(Product::staticProductPredicate);

        Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        list.removeIf(pred);

        // list.removeIf(p -> p.getPrice() >= 100);  

        // CONSUMER:
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        list.forEach(new PriceUpdate());
        list.forEach(Product::staticProductPredicate);
        list.forEach(Product::nonStaticPriceUpdate);

        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * 1.1);
        };
        list.forEach(cons);
    
        for (Product item: list) {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
        }
    }
}
