import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class aula_156 {
    public static void main(String[] args) {

        String path = "C:\\Users\\f0fp0228\\Desktop\\Curso DEV\\curso_udemy_java\\secao_15_trabalhando_com_arquivos\\arquivoTeste.txt";
        // FileReader fr = null;
        // BufferedReader br = null;

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            // fr = new FileReader(path);
            // br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
