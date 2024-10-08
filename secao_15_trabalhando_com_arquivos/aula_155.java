package secao_15_trabalhando_com_arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class aula_155 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\f0fp0228\\Desktop\\Curso DEV\\curso_udemy_java\\secao_15_trabalhando_com_arquivos\\arquivoTeste.txt");
        Scanner sc = null;
        
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("erro: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();                     
            }       
        }
    }
}
