package secao_10_arrays_listas;

public class aula_97 {
    public static void main(String[] args) {
        
        String[] vetor = new String[] {"Maria", "Pedro", "José"};

        for (int index = 0; index < vetor.length; index ++) {
            System.out.println(vetor[index]);
        }

        for (String nome : vetor) {
            System.out.println(nome);
        }
    }
}
