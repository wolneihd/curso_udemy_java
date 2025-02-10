package secao_18_funcional_lambda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import secao_18_funcional_lambda.entities.Product;

public class aula_202 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\f0fp0228\\Desktop\\Curso DEV\\curso_udemy_java\\secao_18_funcional_lambda\\arquivos\\in.txt");
        List<Product> list = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {            
			
			String line = br.readLine();
			while (line != null) {			
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
			}	

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

        double avg = list.stream().map(x -> x.getPrice()).reduce(0.0, (x,y) -> x+y) / list.size();
        System.out.println("Média: " + String.format("%.2f", avg));

        Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
        List<String> names = list.stream().filter(p -> p.getPrice() < avg).map(p -> p.getName()).sorted(comp.reversed()).toList();
        names.forEach(System.out::println);
    }
}
