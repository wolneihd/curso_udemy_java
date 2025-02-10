package secao_18_funcional_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import secao_18_funcional_lambda.entities.Product;
import secao_18_funcional_lambda.utils.UpperCaseName;

public class aula_198 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        for (String name: names) {
            System.out.println(name);
        };
        names.forEach(System.out::println);

        List<String> names_2 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        names_2.forEach(System.out::println);

        List<String> names_3 = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        names_3.forEach(System.out::println);

        Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> names_4 = list.stream().map(func).collect(Collectors.toList());
        names_4.forEach(System.out::println);
    }
}
