package secao_17_generic_set_map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import secao_17_generic_set_map.entities.Product;
import secao_17_generic_set_map.services.CalculationService;

public class aula_130 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\f0fp0228\\Desktop\\Curso DEV\\curso_udemy_java\\secao_17_generic_set_map\\teste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(";");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product maior = CalculationService.max(list);
            System.err.println("\nMaior: " + maior);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
