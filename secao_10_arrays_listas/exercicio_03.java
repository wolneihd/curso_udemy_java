package secao_10_arrays_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import secao_10_arrays_listas.entities.Colaborador;

public class exercicio_03 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite a quantidade de funcionários a cadastrar: ");
        int quantidadeCadastros = sc.nextInt();
        sc.nextLine(); // Consome a nova linha após nextInt()

        List<Colaborador> colaboradores = new ArrayList<>();

        for (int i = 0; i < quantidadeCadastros; i++) {
            int id;
            boolean checkId;

            // Verifica se o ID já existe
            do {
                checkId = false;
                System.out.print("\nDigite o id do colaborador: ");
                id = sc.nextInt();
                sc.nextLine(); // Consome a nova linha após nextInt()

                for (Colaborador colaborador : colaboradores) {
                    if (id == colaborador.getId()) {
                        System.out.println("ID já utilizado! Tente novamente.");
                        checkId = true;
                        break;
                    }
                }
            } while (checkId);

            // Entrada do nome e salário
            System.out.print("\nDigite o nome do colaborador: ");
            String nome = sc.nextLine();

            System.out.print("\nDigite o salário do colaborador: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // Consome a nova linha após nextDouble()

            // Adiciona o colaborador na lista
            colaboradores.add(new Colaborador(id, nome, salary));
        }

        for (Colaborador colaborador : colaboradores) {
            System.out.println(colaborador.toString());
        }

        sc.close();
    }
}
