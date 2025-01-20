package secao_18_funcional_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import secao_18_funcional_lambda.entities.Product;

public class aula_193 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        list.sort(comp);

        for (Product p: list) {
            System.out.println(p.getName());
        }        
    }
}
