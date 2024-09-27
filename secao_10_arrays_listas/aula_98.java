package secao_10_arrays_listas;

import java.util.List;
import java.util.ArrayList;

public class aula_98 {
    public static void main(String[] args) {
  
        /*
         * [Lista] de tipo [String] com nome [nomes] que é instanciada conforme a importação de [ArrayList];
         */
        List<String> nomes = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("José");
        nomes.add(2, "Marco");
        nomes.remove(0);

        for (String nome: nomes) {
            System.out.println(nome);
        }

        System.out.println(nomes.indexOf("José"));

        // Usando Stream para filtrar nomes que começam com 'J' e transformar em maiúsculas
        List<String> resultado = nomes.stream()
                                      .filter(nome -> nome.startsWith("J"))  // Filtra nomes que começam com 'J'
                                      .map(String::toUpperCase)                     // Converte para maiúsculas
                                      .toList();                                    // Coleta o resultado em uma lista

        /**
         * filter(): Filtra os elementos de acordo com uma condição.
         * map(): Transforma os elementos, aplicando uma função a cada um.
         * sorted(): Ordena os elementos de acordo com uma ordem natural ou fornecida.
         * distinct(): Remove elementos duplicados.
         * limit(): Limita o número de elementos no stream.
         */
        System.out.println(nomes.stream().distinct().toList());
        System.out.println(nomes.stream().sorted().toList());
        System.out.println(nomes.stream().limit(2).toList());
        System.out.println(nomes.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null));

        for (String nome: resultado) {
            System.out.println(nome);
        }
    }
}
