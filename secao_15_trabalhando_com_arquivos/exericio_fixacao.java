import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.util.List;
import java.util.ArrayList;

import entidades.Produto;

public class exericio_fixacao {
    public static void main(String[] args) {
        
        String path = "C:\\Users\\f0fp0228\\Desktop\\Curso DEV\\curso_udemy_java\\secao_15_trabalhando_com_arquivos\\exercicio_arquivos\\in.csv";
        String savePath = "C:\\Users\\f0fp0228\\Desktop\\Curso DEV\\curso_udemy_java\\secao_15_trabalhando_com_arquivos\\exercicio_arquivos\\summary.csv";

        List<Produto> produtos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            // importa arquivo e instancia o objeto PRODUTO
            String line = br.readLine();
            while (line != null) {
                String[] palavras = line.split(";");
                Produto novoProduto = new Produto(palavras[0], Double.valueOf(palavras[1]), Integer.valueOf(palavras[2]));
                produtos.add(novoProduto);
                line = br.readLine();
            }

            // imprime no console os dados:
            for (Produto produto: produtos) {
                System.out.println(produto.toString());
            }

            // Salva summary.csv --> importar encerrar o bw para garantir que seja salvo o csv.
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(savePath))) {
                for (Produto produto : produtos) {
                    bw.write(produto.getNome() + ";" + produto.total());
                    bw.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } 

    }
}
