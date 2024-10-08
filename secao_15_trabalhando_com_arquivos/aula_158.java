
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class aula_158 {
    public static void main(String[] args) {

        String[] lines = new String[] {"texto01","texto02","texto03"};
        String path = "C:\\Users\\f0fp0228\\Desktop\\Curso DEV\\curso_udemy_java\\secao_15_trabalhando_com_arquivos\\arquivoTeste02.txt";

        // campo (true), adiciona o texto ao já existente. Caso (em branco), recria o arquivo.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
